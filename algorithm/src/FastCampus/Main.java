package algorithm.src.FastCampus;

import java.util.*;
import java.io.*;

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int[][] result;
    static int n, m;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new boolean[n][m];
        result = new int[n][m];

        for(int i=0;i<n;i++){
            String str = br.readLine();
            for(int j=0;j<m;j++) {
                arr[i][j] = str.charAt(j)-'0';
            }
        }
        bfs(0,0);

        System.out.println(result[n-1][m-1]);
    }
    public static void bfs(int x, int y){
        visited[x][y] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        result[x][y] = 1;

        while(!q.isEmpty()){
            int[] cur = q.poll();

            for(int i=0;i<4;i++){
                int x1 = cur[0] + dx[i];
                int y1 = cur[1] + dy[i];

                if(x1<0 || y1<0 ||x1>=n || y1>=m) continue;
                if(!visited[x1][y1] && arr[x1][y1]==1){
                    q.add(new int[] {x1, y1});
                    visited[x1][y1]= true;
                    result[x1][y1] = result[cur[0]][cur[1]]+1;
                }
            }
        }
    }
}
