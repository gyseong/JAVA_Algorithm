package level1;

import java.util.*;

public class Main2750 {
	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		int a = n.nextInt();
		int[] arr = new int[a];

		for (int i = 0; i < a; i++) {
			arr[i] = n.nextInt();
		}
		for (int i = 0; i < a; i++) {
			int min_index = i;
			for (int j = i + 1; j < a; j++) {
				if (arr[min_index] > arr[j]) {
					min_index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		for (int i = 0; i < a; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
