package algorithm.src.Doit;

import java.io.*;
import java.util.*;

public class BOJ_11724 {
    public static boolean[] visited;
    public static int[][] dfs;
    public static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1];
        dfs = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            dfs[a][b] = 1;
            dfs[b][a] = 1;
        }
        int count=0;

        for(int i=1;i<n+1;i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    public static void DFS(int v) {
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i=1;i<n+1;i++){
            if(dfs[v][i]==1 && !visited[i]){
                DFS(i);
            }
        }
    }
}
