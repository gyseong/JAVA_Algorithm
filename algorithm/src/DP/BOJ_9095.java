package algorithm.src.DP;

import java.util.*;
import java.io.*;

public class BOJ_9095 {
    static int[] dp;
    static int t,n;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        pro();
        for(int i=0;i<t;i++){
            n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }
    }
    static void pro(){
        dp = new int[12];
        //초기값 구하기
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        //점화식을 토대로 dp 배열 채우기
        for(int i=4;i<=11;i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
    }
}
