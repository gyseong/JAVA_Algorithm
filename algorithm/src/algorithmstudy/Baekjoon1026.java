package algorithmstudy;

import java.io.*;
import java.util.*;

//Baekjoon 1026(º¸¹°)
public class Baekjoon1026 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());

		Integer[] arr = new Integer[a];
		Integer[] arr1 = new Integer[a];

		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < a; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arr1[i] = Integer.parseInt(st1.nextToken());
		}
		Arrays.sort(arr);
		Arrays.sort(arr1,Collections.reverseOrder());
		
		int result = 0;
		for(int i=0;i<a;i++) {
			result += arr[i]*arr1[i];
		}
		System.out.println(result);
	}
}
