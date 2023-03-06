package algorithmstudy;

import java.io.*;
import java.util.*;
//수열
public class Baekjoon2559 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int[] arr = new int[a];
		int max = Integer.MIN_VALUE;
		
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		} // 배열입력

		for (int i = 0; i <= a - b; i++) {
			int sum=0;
			for (int j = i; j < i + b; j++) {
				sum += arr[j];
			}
			max = Math.max(max,sum);

		}
		System.out.println(max);
	}
}
