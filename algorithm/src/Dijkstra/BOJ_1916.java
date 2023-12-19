package algorithm.src.Dijkstra;

import java.util.*;
import java.io.*;

public class BOJ_1916 {
    static class Edge{
        public int to, weight;

        public Edge(int _to, int _weight){
            this.to = _to;
            this.weight = _weight;
        }
    }
    static class Info{
        public int idx, dist;

        public Info(){

        }
        public Info(int _idx, int _dist){
            this.idx = _idx;
            this.dist = _dist;
        }
    }
    static int[] dist;
    static int n,m;
    static ArrayList<Edge>[] edges;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        dist = new int[n+1];


        for(int i=0;i<m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

        }

    }
    static void dijstra(int start){

        // 배열 초기화
        for(int i=1;i<=n;i++) dist[i] = Integer.MAX_VALUE;

        //최소 힙 생성
        PriorityQueue<Info> pq = new PriorityQueue<>(Comparator.comparingInt(o ->o.dist));
        pq.add(new Info(start, 0));
        dist[start] = 0;
        //시작점에 대한 information을 기록에 추가하고, 거리 배열 갱신
        while(!pq.isEmpty()){
            //pq가 가진 가장 작은 거리 값을 가진 것을 빼준다.
            Info info  = pq.poll();
            if(dist[info.idx]<info.dist) continue;
            for(Edge e : edges[info.idx]){
                if(dist[info.idx] + e.weight >= dist[e.to]) continue;

                dist[e.to] = dist[info.idx] +e.weight;
                pq.add(new Info(e.to,dist[e.to]));
            }
        }

        //거리 정보들이 모두 소진될 때까지 거리 갱신 반복
    }
}
