package algorithmstudy;

import java.io.*;
import java.util.*;
//11866

public class Main11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Queue<Integer> qr = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			qr.add(i);
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M - 1; j++) {
				qr.add(qr.poll());
			}
			sb.append(qr.poll() + ", ");
		}
		sb.setLength(sb.length()-2);
		System.out.println(sb);
	}
}
