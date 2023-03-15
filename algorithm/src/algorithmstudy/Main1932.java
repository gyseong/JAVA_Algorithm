package algorithmstudy;

import java.io.*;
import java.util.*;

public class Main1932 {
	public static int[][] dp;
	public static int[][] arr;
	public static int a;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		a = Integer.parseInt(br.readLine());
		arr = new int[a][a];
		dp = new int[a][a];

		for (int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j <= i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (i == a - 1) {
					dp[i][j] = arr[i][j];
				}
			}
		}
		System.out.println(find(0,0));
	}

	public static int find(int index, int dex) {
		if (index == a - 1)
			return dp[a - 1][dex];
		if (dp[index][dex] == 0) {
			dp[index][dex] = Math.max(find(index+1,dex), find(index+1,dex+1))+arr[index][dex];
		}
		return dp[index][dex];
	}
}
