package algorithm.src.Softeer;

import java.io.*;
import java.util.*;

public class Practice_04 {
    public static int[][] dp;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static int[][][] list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        dp = new int[N][N];
        visited = new boolean[N][N];
        signal();

        LinkedList<int[]> q = new LinkedList<>();

        for (int i = 0; i < N * N; i++) {
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[4];
            for(int j=0;j<4;j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            q.add(arr);
        }
        System.out.println(q);
        /*
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i][j])
                    count++;
            }
        }
        System.out.println(count);

         */
    }
    static void signal(){
        for(int i=0;i<4;i++){

        }
    }
}
