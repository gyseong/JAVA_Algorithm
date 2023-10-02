package algorithm.src.Softeer;

import java.io.*;
import java.util.*;

//숫자의 크기가 크면 long형을 의심해라
public class Practice_01 {
    public static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        dp = new long[N+1];

        dp[0] = K;

        for(int i=1;i<=N;i++){
            dp[i] = (dp[i-1]*P)%1000000007;
        }
        System.out.println(dp[N]);
    }
}
