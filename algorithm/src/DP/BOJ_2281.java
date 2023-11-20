package algorithm.src.DP;

import java.util.*;
import java.io.*;

public class BOJ_2281 {
    static int[][] dp;
    static int n,m;
    static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        dp = new int[n][m];

        for(int i=0;i<n;i++){
            result[i] = Integer.parseInt(br.readLine());
        }
    }
}
