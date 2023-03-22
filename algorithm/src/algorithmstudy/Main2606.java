package algorithmstudy;

import java.io.*;
import java.util.*;
//2606
public class Main2606 {
	public static boolean[] visited;
	public static int[][] check;
	static int count = 0;
	static int n, m;

	static Queue<Integer> q = new LinkedList<Integer>();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());

		check = new int[n + 1][n + 1];
		visited = new boolean[n + 1];

		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			check[a][b] = check[b][a] = 1;
		}
		bfs(1);
		System.out.println(count);
	}

	public static void bfs(int start) {
		visited[start] = true;
		q.add(start);

		while (!q.isEmpty()) {
			start = q.poll();

			for (int i = 1; i <= n; i++) {
				if (check[start][i] == 1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
					count++;
				}
			}
		}
	}
}
