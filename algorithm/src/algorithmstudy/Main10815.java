package algorithmstudy;

import java.io.*;
import java.util.*;
//10815

public class Main10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(br.readLine());
		int[] arr = new int[a];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int b = Integer.parseInt(br.readLine());
		int[] arr1 = new int[b];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < b; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < b; i++) {
			sb.append(search(arr, a, arr1[i]) + " ");
		}
		System.out.println(sb);
	}

	public static int search(int[] arr, int a, int key) {
		int start = 0;
		int end = a - 1;
		int mid = 0;

		while (start <= end) {
			mid = (start + end) / 2;

			if (arr[mid] == key) {
				return 1;
			} else if (arr[mid] < key) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return 0;
	}
}
