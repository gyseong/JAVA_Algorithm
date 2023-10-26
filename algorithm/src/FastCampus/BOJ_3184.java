package algorithm.src.FastCampus;

import java.io.*;
import java.util.*;

public class BOJ_3184 {
    static int n, m, countO, countV;
    static boolean[][] visited;
    static char[][] arr;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new char[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1];

        //input
        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            for (int j = 1; j <= m; j++) {
                arr[i][j] = str.charAt(j - 1);
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (!visited[i][j] && arr[i][j] != '#') {
                    bfs(i, j);
                }
            }
        }
        System.out.println(countO + " " + countV);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        visited[x][y] = true;
        q.offer(new int[]{x, y});

        int wolf = 0, sheep = 0;

        while (!q.isEmpty()) {

            int[] cur = q.poll();

            if (arr[cur[0]][cur[1]] == 'v') {
                wolf++;
            } else if (arr[cur[0]][cur[1]] == 'o') {
                sheep++;
            }

            for (int i = 0; i < 4; i++) {
                int x1 = cur[0] + dx[i];
                int y1 = cur[1] + dy[i];

                if (0 < x1 && x1 <= n && 0 < y1 && y1 <= m) {
                    if (!visited[x1][y1] && arr[x1][y1] != '#') {
                        q.offer(new int[]{x1, y1});
                        visited[x1][y1] = true;
                    }
                }
            }
        }
        if (sheep <= wolf) {
            countV += wolf;
        } else {
            countO += sheep;
        }

    }
}
