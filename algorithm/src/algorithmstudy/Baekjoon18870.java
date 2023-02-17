package algorithmstudy;

import java.util.*;
import java.io.*;

public class Baekjoon18870 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		int[] arr = new int[a];
		int[] sorting = new int[a];
		HashMap<Integer, Integer> ranking = new HashMap<Integer, Integer>();

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < a; i++) {
			sorting[i] = arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(sorting);

		int rank = 0;
		for (int v : sorting) {
			if (!ranking.containsKey(v)) { //hashmap 안에서 중복되는 값이 있나 확인하고 넣어줌
				ranking.put(v, rank);
				rank++;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int key : arr) {
			int ranks = ranking.get(key);
			sb.append(ranks).append(' ');
		}
		System.out.println(sb);
	}
}
