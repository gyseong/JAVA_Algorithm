package algorithm.src.Doit;

import java.io.*;
import java.util.*;

public class BOJ_2178 {
    public static boolean[][] visited;
    public static int[][] dfs;
    public static int n, m;
    public static int[] x = {1, 0, -1, 0};
    public static int[] y = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        dfs = new int[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1];

        for (int i = 1; i < n + 1; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                dfs[i][j + 1] = str.charAt(j) - '0';
            }
        }
        dp();
        System.out.println(dfs[n][m]);
    }

    public static void dp() {
        Queue<int[]> q = new LinkedList<>();
        int i = 1;
        int j = 1;
        q.add(new int[]{i, j});

        while (!q.isEmpty()) {
            int now[] = q.poll();
            visited[i][j] = true;
            for (int k = 0; k < 4; k++) {
                int nowX = now[0] + x[k];
                int nowY = now[1] + y[k];
                if (nowX < 1 || nowY < 1 || nowX > n || nowY > m) continue;
                if(dfs[nowX][nowY]==1 && !visited[nowX][nowY]){
                    visited[nowX][nowY] = true;
                    dfs[nowX][nowY] = dfs[now[0]][now[1]] + 1;
                    q.add(new int[] {nowX, nowY});
                }
            }
        }
    }
}

