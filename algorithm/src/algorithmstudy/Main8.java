package algorithmstudy;

import java.util.*;
import java.io.*;

public class Main8 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int row, column, x, y, direction, count = 0;

		StringTokenizer st = new StringTokenizer(sc.nextLine());
		row = Integer.parseInt(st.nextToken());
		column = Integer.parseInt(st.nextToken());

		StringTokenizer st1 = new StringTokenizer(sc.nextLine());
		x = Integer.parseInt(st1.nextToken());
		y = Integer.parseInt(st1.nextToken());
		direction = Integer.parseInt(st1.nextToken());

		int[][] arr = new int[row][column];
		int[][] d = new int[50][50];
		
		int[] dx = { 0, 0, 1, -1 };
		int[] dy = { 1, -1, 0, 0 };

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

			}
		}
	}
}
