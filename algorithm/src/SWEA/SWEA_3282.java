package algorithm.src.SWEA;

import java.util.*;
import java.io.*;

public class SWEA_3282 {
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int test = 1; test <= 1; test++) {

            int k = Integer.parseInt(br.readLine());
            arr = new int[16][16];
            visited = new boolean[16][16];

            // 배열 완성
            for (int i = 0; i < 16; i++) {
                String str = br.readLine();
                for (int j = 0; j < str.length(); j++) {
                    arr[i][j] = str.charAt(j) - '0';
                }
            }

            // 출발점에 도착하면 boolean true 아니면, false
            int ix = 0;
            int iy = 0;

            for (int i = 0; i < 16; i++) {
                for (int j = 0; j < 16; j++) {
                    if (arr[i][j] == 2) {
                        ix = i;
                        iy = j;
                    }
                }
            }
            // 시작점에서 dfs
            dfs(ix, iy);

            int check=0;
            for (int i = 0; i < 16; i++) {
                for (int j = 0; j < 16; j++) {
                    if (arr[i][j] == 3) {
                        ix = i;
                        iy = j;
                    }
                }
            }
            if(visited[ix][iy]){
                check = 1;
            }else{
                check = 0;
            }
            System.out.println("#" + k + " " + check);
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int x1 = x + dx[i];
            int y1 = y + dy[i];
            if (x1 < 0 || y1 < 0 || x1 > 15 || y1 > 15) continue;
            if (!visited[x1][y1] && (arr[x1][y1] == 0|| arr[x1][y1]==3)) {
                dfs(x1, y1);
            }
        }
    }
}
