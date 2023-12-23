package algorithm.src.BFSDFS;

import java.util.*;
import java.io.*;

public class BOJ_7569 {
    static boolean[][][] visited;
    static int[][][] arr;
    static int m, n, h, max = Integer.MIN_VALUE;
    static int[] dz = { 0, 0, 0, 0, -1, 1 };
    static int[] dy = { 0, 0, -1, 1, 0, 0 };
    static int[] dx = { -1, 1, 0, 0, 0, 0 };
    static Queue<int[]> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        arr = new int[h][n][m];
        visited = new boolean[h][n][m];

        // 배열 완성
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    arr[i][j][k] = Integer.parseInt(st1.nextToken());
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (arr[i][j][k] == 1) {
                        // 1인것 q 추가
                        q.offer(new int[]{i, j, k});
                    }
                }
            }
        }
        System.out.println(bfs());
    }

    static int bfs() {

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            for (int i = 0; i < 6; i++) {
                int x1 = cur[1] + dx[i];
                int y1 = cur[2] + dy[i];
                int z1 = cur[0] + dz[i];

                if (x1 < 0 || y1 < 0 || z1 < 0 || x1 >= n || y1 >= m || z1 >= h) continue;

                if (arr[z1][x1][y1] == 0) {
                    q.add(new int[]{z1, x1, y1});
                    arr[z1][x1][y1] = arr[cur[0]][cur[1]][cur[2]] + 1;
                }
            }
        }
        for(int i=0;i<h;i++){
            for(int j=0;j<n;j++){
                for(int k = 0;k<m;k++){
                    if(arr[i][j][k]==0) return -1;
                    max = Math.max(max,arr[i][j][k]);
                }
            }
        }
        if(max==1){
            return 0;
        }else{
            return max-1;
        }
    }
}
