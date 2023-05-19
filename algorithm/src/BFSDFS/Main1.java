package algorithm.src.BFSDFS;

import java.awt.*;
import java.util.*;
import java.io.*;

public class Main1 {
    static class Node {
        int index;
        int cost;

        public Node(int index, int cost) {
            this.index = index;
            this.cost = cost;
        }
    }
    static ArrayList<Node>[] graph;
    static boolean[] visited;
    static int[] dist;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());

        graph = new ArrayList[v + 1];
        dist = new int[v + 1];
        visited = new boolean[v + 1];

        for (int i = 1; i <= v; i++) {
            graph[i] = new ArrayList<>();
            dist[i] = Integer.MAX_VALUE; //최대값으로 초기화, 최단거리를 찾기 위함.
        }

        for (int i = 0; i < e; i++) {
            // u -> v 로 가는 가중치 w가 주어진다.
            st = new StringTokenizer(br.readLine());
            int inputU = Integer.parseInt(st.nextToken()); //여기서
            int inputV = Integer.parseInt(st.nextToken()); //여기로 가는
            int inputW = Integer.parseInt(st.nextToken()); //가중치

            graph[inputU].add(new Node(inputV, inputW));
        }
        djikstra(k);
        for (int i = 1; i <= v; i++) {
            System.out.println(dist[i] == Integer.MAX_VALUE ? "INF" : dist[i]);
        }
    }
    static void djikstra(int start){
        PriorityQueue<Node> q = new PriorityQueue<>((o1, o2) -> o1.cost-o2.cost);

        q.add(new Node(start,0));
        dist[start] = 0;

        while(!q.isEmpty()){
            Node now = q.poll();

            if(!visited[now.index]){
                visited[now.index]=true;
            }
            for(Node next : graph[now.index]){
                if (!visited[next.index] && dist[next.index] > now.cost + next.cost) {
                    dist[next.index] = now.cost + next.cost;
                    q.add(new Node(next.index, dist[next.index]));
                }
            }
        }
    }
}


