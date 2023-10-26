package algorithm.src.FastCampus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_1068 {
    static ArrayList<Integer>[] list;
    static int[] leaf;
    static int n,root,erased;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        list = new ArrayList[n];
        leaf = new int[n];
        for(int i=0;i<n;i++) list[i] = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        erased = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            int a = Integer.parseInt(st.nextToken());

            //par이 -1이면 i가 루트라는 소리
            if(a ==-1) {
                root = i;
                continue;
            }
            //노드 추가
            list[a].add(i);
        }
        pro();
    }
    static void pro(){
        //리스트에 erased가 있는지 없는지 탐색 있다면 부모노드로부터 erased로 가는 간선 제거
        for(int i=0;i<n;i++){
            if(list[i].contains(erased)){
                list[i].remove(list[i].indexOf(erased));
            }
        }
        //root 노드가 erased라면 전체가 0이 될것이다. 그래서 root가 0이 아닐때 dfs
        if(root !=erased) dfs(root);

        //출력
        System.out.println(leaf[root]);
    }
    //dfs(x, par) => 정점 x의 부모가 par, subtree의 leaf 개수를 세주는 함수
    static void dfs(int x){
        //리스트가 비어있다면 -> 단말 노드가 없다면, leaf[x] = 1; root노드에 대해서 단말 노드가 하나 있는거임
        if(list[x].size()==0){
            leaf[x] = 1;
        }
        //그렇지 않다면 y에 대해서 dfs하고 x의 값에 누적합 해주면 단말 노드의 개수를 알 수가 있다.
        for(int y : list[x]){
            dfs(y);
            leaf[x] += leaf[y];
        }
    }
}
