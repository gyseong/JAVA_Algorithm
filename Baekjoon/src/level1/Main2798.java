package level1;

import java.util.*;
import java.io.*;

public class Main2798 {
	public static void main(String[] args) throws IOException {

		Scanner n = new Scanner(System.in);

		int a = n.nextInt();
		int max = n.nextInt();

		int[] arr = new int[a];
		int sum = 0;
		int result = 0;

		for (int i = 0; i < a; i++) {
			arr[i] = n.nextInt();
		}
		for (int i = 0; i < a; i++) {
			for (int j = i + 1; j < a; j++) {
				for (int k = j + 1; k < a; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if (max == sum) {
						result = sum;
					} else if (max > sum) {
						result = Math.max(result, sum);
					} else {
						result = Math.min(result, sum);
					}
				}
			}
		}
		System.out.println(result);
	}
}
