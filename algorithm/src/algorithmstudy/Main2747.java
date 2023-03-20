package algorithmstudy;

import java.util.*;
import java.io.*;

//2747
public class Main2747 {
	public static int[] dp = new int[46];
	public static int n;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		System.out.println(fibo(n));
	}
	public static int fibo(int n ) {
		
		dp[0] = 0;
		dp[1] = 1;
	
		for(int i=2;i<46;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
}
