package algorithm.src.Softeer;

import java.io.*;
import java.util.*;

public class Practice_02 {
    public static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long result = d(P, N*10) *K;
        System.out.println(result%1000000007);
        /*
        dp = new long[N+1];

        dp[0] = K;

        for(int i=1;i<=N;i++){
            dp[i] = (dp[i-1]*P)%1000000007;
            dp[i] = (int)Math.pow(dp[i],10);
        }
        System.out.println(dp[N]);
        */
    }
    public static long d(int x, int y){
        long res;
        if(y==1) return x;
        else if(y%2==0){
            res  = d(x , y/2);
            return  (res * res) % 1000000007;
        }else{
            res = d(x, (y-1)/2);
            return (res * res * x) % 1000000007;
        }
    }
}
