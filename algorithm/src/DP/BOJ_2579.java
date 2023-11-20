package algorithm.src.DP;

import java.util.*;
import java.io.*;

public class BOJ_2579 {

    static int[] dp;
    static int n,sum=0;
    static int[] result;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        result = new int[n+1];

        for(int i=1;i<=n;i++){
            result[i] = sc.nextInt();
        }
        pro();
    }
    static void pro(){

        dp = new int[n+1];

        dp[0] = 0;
        dp[1] = result[1];

        for(int i=2;i<=n;i++){
            dp[i] = Math.max(dp[i-2]+result[i],dp[i-1]+result[i]);
            System.out.println(dp[i]);
        }
    }
}