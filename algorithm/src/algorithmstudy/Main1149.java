package algorithmstudy;

import java.io.*;
import java.util.*;

public class Main1149 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int[][] arr = new int[a][3];

		for (int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 1; i < a; i++) {
			arr[i][0] += Math.min(arr[i - 1][1], arr[i - 1][2]);
			arr[i][1] += Math.min(arr[i - 1][0], arr[i - 1][2]);
			arr[i][2] += Math.min(arr[i - 1][0], arr[i - 1][1]);
		}
		System.out.println(Math.min(Math.min(arr[a - 1][0], arr[a - 1][1]), arr[a - 1][2]));
	}
}
