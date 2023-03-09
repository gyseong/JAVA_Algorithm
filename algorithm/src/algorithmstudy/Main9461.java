package algorithmstudy;

import java.io.*;
import java.util.*;

public class Main9461 {
	public static long[] dp = new long[101];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		p();
		int a = Integer.parseInt(br.readLine());
		for (int i = 0; i < a; i++) {
			int b = Integer.parseInt(br.readLine());
			sb.append(dp[b]).append("\n");
		}
		System.out.println(sb);
	}

	public static void p() {
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		for (int i = 4; i < 101; i++) {
			dp[i] = dp[i - 2] + dp[i - 3];
		}
	}
}
