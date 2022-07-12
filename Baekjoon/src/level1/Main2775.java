package level1;

import java.util.*;
import java.io.*;

public class Main2775 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner n = new Scanner(System.in);

		int[][] arr = new int[15][15];

		for (int i = 0; i < 15; i++) {
			arr[0][i] = i;
			for (int j = 1; j < 15; j++) {
				for (int m = 0; m <= i; m++) {
					arr[j][i] += arr[j - 1][m];
				}
			}

		}

		int a = n.nextInt();

		for (int i = 0; i < a; i++) {
			int b = n.nextInt();
			int c = n.nextInt();

			System.out.println(arr[b][c]);
		}
	}
}