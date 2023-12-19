package algorithm.src.BFSDFS;

import java.util.*;
import java.io.*;

public class BOJ_2644 {
    static int n,m,x,y;
    static int[] arr;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        // 거리 배열
        arr = new int[n+1];

        // 방문 확인 배열
        visited = new boolean[n+1];

        // 노드 연결 파악하는 리스트 생성
        for(int i=0;i<=n;i++){
            list.add(new ArrayList<>());
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 촌수를 따질 정수 입력
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        // 관계의 개수 입력
        m = Integer.parseInt(br.readLine());

        for(int i=0;i<m;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());

            list.get(a).add(b);
            list.get(b).add(a);
        }
        System.out.println(bfs(x,y));
    }
    static int  bfs(int start, int end){
        Queue<Integer> q = new LinkedList<>();

        // 시작 노드의 거리를 0으로 처리, 방문 처리
        arr[start] = 0;
        visited[start] = true;

        // 큐에 삽입
        q.offer(start);

        // Q가 빌때까지
        while(!q.isEmpty()){

            // 큐에서 값을 꺼냄
            int cur = q.poll();

            // CUR 위치의 연결된 리스트들을 한바퀴 돌자!
            for(int a : list.get(cur)){
                // 방문처리 안된것들만
                if(!visited[a]){
                    // 한칸 전진했으니까 +1
                    arr[a] = arr[cur]+1;
                    // 만약 a가 end랑 같다? return arr[a]
                    if(a==end){
                        return arr[a];
                    }
                    // q에 넣고 다시 반복, 방문 처리
                    q.offer(a);
                    visited[a] = true;
                }
            }
        }
        return -1;
    }
}
