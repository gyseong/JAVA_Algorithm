package level1;

import java.util.*;
import java.io.*;

public class Main1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		String[] arr = new String[a];

		for (int i = 0; i < a; i++) {
			arr[i] = br.readLine();
		}//배열 입력

		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else
					return s1.length() - s2.length();
			}
		}); //람다식으로 사전순으로 정렬
		StringBuilder sb = new StringBuilder();

		sb.append(arr[0]).append('\n');

		for (int i = 1; i < a; i++) {
			if (!arr[i].equals(arr[i - 1])) {
				sb.append(arr[i]).append('\n');
			}
		}
		System.out.println(sb);
	}
}
