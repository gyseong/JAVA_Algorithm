package algorithm.src.FastCampus;
import java.util.*;
import java.io.*;

public class BOJ_11725 {
    static ArrayList<Integer>[] list;
    static int[] parent;
    static int n;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        //노드가 1부터 시작이니까 n+1로 배열 생성 -> 부모 배열 또한 동일
        list = new ArrayList[n+1];
        parent = new int[n+1];

        //노드의 개수만큼 list 생성
        for(int i=1;i<=n;i++){
            list[i] = new ArrayList<>();
        }
        //입력받고 list에 값 저장
        for(int i=1;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            //list에 a에 b추가
            list[a].add(b);
            list[b].add(a);
        }
        pro();
    }
    static void dfs(int root, int par){
        //정점들을 하나씩 본다
        for(int y : list[root]){
            //보고 있는게 부모면 내 자식이 아니니까 무시해준다 -> visitd 배열 땜빵임ㅋㅋ
            if(y==par) continue;
            parent[y] = root;
            dfs(y, root);
        }
    }
    static void pro(){
        //1부터 dfs 시작하되, 1이 root이므로 부모가 없음을 -1로 표시
        dfs(1,-1);

        for(int i=2;i<=n;i++){
            System.out.println(parent[i]);
        }
    }
}
