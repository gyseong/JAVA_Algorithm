package algorithmstudy;

import java.util.*;

public class Baekjoon1977{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();

		int M = s.nextInt();
		int N = s.nextInt();
		int sum = 0;

		for (int i = M; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i % j) == 0) {
					if ((i / j) == j) {
						array.add(i);
					}
				}
			}
		}

		for (int k = 0; k < array.size(); k++) {
			sum += array.get(k);
		}
		if (array.size() == 0) {
			System.out.println(-1);
		} else {
			int min = (int) Collections.min(array); 
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
