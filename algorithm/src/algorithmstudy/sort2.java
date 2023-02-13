package algorithmstudy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class sort2 {
	public static void main(String[] args) {

		int n = 10;
		int[] arr = { 7, 5, 8, 2, 5, 3, 1, 6, 9 ,10};

		//select sort
		for (int i = 0; i < n; i++) {
			int min_index = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[min_index] > arr[j]) {
					min_index = j;
				}
			}
			//swap
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
