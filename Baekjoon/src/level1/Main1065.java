package level1;

import java.util.*;
import java.io.*;

public class Main1065 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		System.out.println(sum(a));
	}

	public static int sum(int a) {
		int count = 0;

		if (a < 100) {
			return a;
		} else {
			for(int i=1;i<100;i++) {
				count++;
			}
			
			for (int i = 100; i <= a; i++) {
				int b = i / 100;
				int c = (i /10) % 10;
				int d = i % 10;
				if ((b - c) == (c - d)) {
					count++;
				}
			}
		}
		return count;
	}
}
