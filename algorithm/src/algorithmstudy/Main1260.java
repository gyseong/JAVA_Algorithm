package algorithmstudy;

import java.util.*;
import java.io.*;

public class Main1260 {
	public static int n, m, v;
	public static boolean[] visited;
	public static int[][] check;
	public static Queue<Integer> q = new LinkedList<Integer>();

	public static void dfs(int x) {
		visited[x] = true;
		System.out.print(x + " ");
		for (int i = 0; i <= n; i++) {
			if (check[x][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
	}

	public static void bfs(int start) {
		q.add(start);
		visited[start] = true;

		while (!q.isEmpty()) {
			start= q.poll();
			System.out.print(start + " ");

			for (int i = 1; i <= n; i++) {
				if (check[start][i] == 1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());

		visited = new boolean[n + 1];
		check = new int[n + 1][n + 1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			check[a][b] = check[b][a] = 1;
		}

		dfs(v);

		System.out.println();

		visited = new boolean[n + 1];
		bfs(v);
	}
}
