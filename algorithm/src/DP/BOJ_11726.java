package algorithm.src.DP;

import java.util.*;
import java.io.*;

public class BOJ_11726 {

    static int[] dp;
    static int n;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        n =sc.nextInt();
        pro();
        System.out.println(dp[n]);
    }
    static void pro(){
        dp = new int[1001];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for(int i=4;i<=n;i++){
            dp[i] = (dp[i-1]+dp[i-2])%10007;
        }
    }
}

