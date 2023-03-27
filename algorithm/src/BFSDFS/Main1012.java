package BFSDFS;

import java.io.*;
import java.util.*;
import java.awt.*;

public class Main1012 {
	public static int m, n, k;
	public static int[][] check;
	public static boolean[][] visited;
	public static int[] dx = { 0, 1, 0, -1 };
	public static int[] dy = { 1, 0, -1, 0 };

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());

			int count = 0;
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());

			check = new int[n][m];
			visited = new boolean[n][m];

			for (int j = 0; j < k; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				check[b][a] = 1;
			}
			for(int j=0;j<n;j++) {
				for(int l=0;l<m;l++) {
					if(check[j][l]==1 && !visited[j][l]) {
						bfs(j,l);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

	public static void bfs(int x, int y) {

		Queue<Point> q = new LinkedList<Point>();

		q.add(new Point(x, y));
		visited[x][y] = true;

		while (!q.isEmpty()) {
			Point p = q.poll();

			for (int i = 0; i < 4; i++) {
				int nowx = p.x + dx[i];
				int nowy = p.y + dy[i];

				if (nowx < 0 || nowy < 0 || nowx >= n || nowy >= m)
					continue;

				if (check[nowx][nowy] == 1 && !visited[nowx][nowy]) {
					q.add(new Point(nowx, nowy));
					visited[nowx][nowy] = true;
				}
			}
		}
	}
}
