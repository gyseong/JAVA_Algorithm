package level1;

import java.util.*;
import java.io.*;

public class Main11399 { // 11399
	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner n = new Scanner(System.in);

		int a = n.nextInt();
		int[] arr = new int[a];
		int sum = 0, sum1 = 0;

		for (int i = 0; i < a; i++) {
			arr[i] = n.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			sum += arr[i];
			sum1 += sum;
		}
		System.out.println(sum1);
	}
}
