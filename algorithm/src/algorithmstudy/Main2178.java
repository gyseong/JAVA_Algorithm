package algorithmstudy;

import java.io.*;
import java.util.*;
import java.awt.*;

public class Main2178 {
	public static boolean[][] visited;
	public static int[][] check;
	static int count = 0;
	static int n, m;
	static int[] x = { 0, 1, 0, -1 };
	static int[] y = { 1, 0, -1, 0 };

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		check = new int[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				check[i][j] = str.charAt(j) - '0';
			}
		}
		System.out.println(bfs(0, 0));
	}

	public static int bfs(int dx, int dy) {
		Queue<Point> q = new LinkedList<Point>();

		q.add(new Point(dx, dy));
		visited[dx][dy] = true;

		int sum = check[0][0];

		while (!q.isEmpty()) {
			Point p = q.poll();

			for (int i = 0; i < 4; i++) {
				int nowX = p.x + x[i];
				int nowY =  p.y+ y[i];

				if (nowX < 0 || nowY < 0 || nowX >= n || nowY >= m)
					continue;
				
				if (check[nowX][nowY] == 1 && !visited[nowX][nowY]) {
					q.add(new Point(nowX, nowY));
					visited[nowX][nowY] = true;
					sum = check[p.x][p.y]+1;
					check[nowX][nowY] = sum;
				}
				dx = nowX;
				dy = nowY;
			}
		}

		return check[n-1][m-1];
	}
}
