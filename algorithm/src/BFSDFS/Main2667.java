package algorithm.src.BFSDFS;

import java.io.*;
import java.util.*;
import java.awt.*;

public class Main2667 {
	public static int[][] check;
	public static boolean[][] visited;
	public static int[] x = { 0, 1, 0, -1 };
	public static int[] y = { 1, 0, -1, 0 };
	public static int n;
	public static int count = 0;
	public static int[] arr;
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		check = new int[n][n];
		visited = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < n; j++) {
				check[i][j] = str.charAt(j) - '0';
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (check[i][j] == 1 && !visited[i][j]) {
					bfs(i, j);
					count++;
				}
			}
		}
		System.out.println(count);
		Collections.sort(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

	public static void bfs(int dx, int dy) {

		Queue<Point> q = new LinkedList<Point>();

		int sum = check[dx][dy];
		int max = check[dx][dy];
		
		q.add(new Point(dx, dy));
		visited[dx][dy] = true;

		while (!q.isEmpty()) {

			Point p = q.poll();

			for (int i = 0; i < 4; i++) {
				int nowx = p.x + x[i];
				int nowy = p.y + y[i];

				if (nowx < 0 || nowy < 0 || nowx >= n || nowy >= n)
					continue;

				if (check[nowx][nowy] == 1 && !visited[nowx][nowy]) {
					q.add(new Point(nowx, nowy));
					visited[nowx][nowy] = true;
					sum += 1;
					check[nowx][nowy] = sum;
				}
				max = Math.max(max, check[nowx][nowy]);
			}
		}
		list.add(max);
	}
}
