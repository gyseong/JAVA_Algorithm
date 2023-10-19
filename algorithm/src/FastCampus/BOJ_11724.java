package algorithm.src.FastCampus;

import java.io.*;
import java.util.*;

public class BOJ_11724 {
    static int m, n;
    static boolean[] visited;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];
        arr = new int[n+1][n+1];

        for(int i=0;i<m;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            arr[a][b]=arr[b][a]=1;
        }
        int count = 0;
        for(int i=1;i<n+1;i++){
            if(!visited[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }
    public static void dfs(int x){
        visited[x] = true;

        for(int i=1;i<n+1;i++){
            if(!visited[i] && arr[x][i]==1){
                dfs(i);
            }
        }
    }
}
