package algorithm.src.FastCampus;

import java.io.*;
import java.util.*;

public class BOJ_1012 {
    static int count, a,n,m,k;

    static boolean[][] visited;
    static int[][] arr;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            arr = new int[m][n];
            visited = new boolean[m][n];

            for(int j=0;j<k;j++){
                StringTokenizer st1 = new StringTokenizer(br.readLine());

                int h = Integer.parseInt(st1.nextToken());
                int l = Integer.parseInt(st1.nextToken());

                arr[h][l]  = 1;
            }
            search();
        }
    }
    public static void search(){

        count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && arr[i][j]==1){
                    dfs(i,j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void dfs(int k, int l){
        visited[k][l] = true;

        for(int i=0;i<4;i++){
            int k1 = k+dx[i];
            int l1 = l+dy[i];
            if(k1<0||l1<0||k1>=m||l1>=n) continue;
            if(visited[k1][l1] || arr[k1][l1]==0)continue;
            dfs(k1,l1);
        }
    }
}
