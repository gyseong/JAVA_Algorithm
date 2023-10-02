package algorithm.src.BFSDFS;

import java.io.*;
import java.util.*;

public class BOJ_1956 {
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        arr = new int[v + 1][v + 1];
        int min = 10000000;
        for (int i = 1; i < v + 1; i++) {
            for (int j = 1; j < v + 1; j++) {
                if (i == j) arr[i][j] = 0;
                else arr[i][j] = min;
            }
        }
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            arr[a][b] = c;
        }
        //플로이드 워셀 알고리즘
        for (int k = 1; k < v + 1; k++) {
            for (int s = 1; s < v + 1; s++) {
                for (int e = 1; e < v + 1; e++) {
                    arr[s][e] = Math.min(arr[s][e], arr[s][k] + arr[k][e]);
                }
            }
        }
        int max= min;
        for(int i=1;i<v+1;i++){
            for(int j=1;j<v+1;j++){
                if(i==j) continue;
                if(arr[i][j]!=min && arr[j][i]!=min)
                    max = Math.min(max, arr[i][j]+arr[j][i]);
            }
        }
        if(max ==min) max = -1;

        System.out.println(max);
    }
}
