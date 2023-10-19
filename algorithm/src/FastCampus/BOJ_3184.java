package algorithm.src.FastCampus;

import java.io.*;
import java.util.*;

public class BOJ_3184 {
    static int n, m;
    static boolean[][] visited;
    static char[][] arr;
    static int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new char[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            for (int j = 1; j <= m; j++) {
                arr[i][j] = str.charAt(j - 1);
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (arr[i][j] == '.' && !visited[i][j]) {
                    dfs(i, j);
                }
            }
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;


        for (int i = 0; i < 8; i++) {
            int x1 = x + dx[i];
            int y1 = y + dy[i];

            if(x1<0 || y1<0 || x1>=m+1 || y1>=n+1) continue;
        }
    }
}
