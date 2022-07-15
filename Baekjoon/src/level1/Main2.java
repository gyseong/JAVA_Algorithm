package level1;

import java.util.*;
import java.io.*;

public class Main2 {
	public static int remove_Duplicate_Elements(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] tempA = new int[n]; //임시배열
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				tempA[j++] = arr[i];
			}
		}
		tempA[j++] = arr[n - 1];
		for (int i = 0; i < j; i++) {
			arr[i] = tempA[i];
		}
		return j;
	}
	
	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		int[] arr = new int[10];
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];

		for (int i = 0; i <= 9; i++) {
			arr[i] = n.nextInt();
			arr1[i] = arr[i] % 42;
		}
		Arrays.sort(arr1);
		int count = remove_Duplicate_Elements(arr1, arr.length);

		System.out.println(count);
	}
}
