package algorithm.src.FastCampus;

import java.io.*;
import java.util.*;
public class BOJ_4963 {
    static ArrayList<Integer> list;
    static int n, m;
    static boolean[][] visited;
    static int[][] arr;
    static int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) break;

            arr = new int[m+1][n+1];
            visited = new boolean[m+1][n+1];

            for(int i=1;i<=m;i++){
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                for(int j=1;j<=n;j++){
                    arr[i][j] = Integer.parseInt(st1.nextToken());
                }
            }

            int count = 0;
            for(int i=1;i<=m;i++){
                for(int j=1;j<=n;j++) {
                    if (!visited[i][j] && arr[i][j] == 1) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
    public static void dfs(int x, int y){

        visited[x][y] = true;

        for(int i=0;i<8;i++){
            int x1 = x+dx[i];
            int y1 = y+dy[i];

            if(x1<0 || y1<0 || x1>=m+1 || y1>=n+1) continue;
            if(arr[x1][y1]==1 && !visited[x1][y1]){
                dfs(x1,y1);
            }
        }
    }
}
