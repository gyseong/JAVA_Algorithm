package level1;

import java.util.*;
import java.io.*;

public class Main1427 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		int a = n.nextInt();
		int[] arr = new int[10];
		int i=0;
		
		while (a != 0) {
			arr[i] = a%10;
			a = a / 10;
			i++;
		}
		Arrays.sort(arr);
		for(int j=9;j>=10-i;j--) {
			System.out.print(arr[j]);
		}
	}
}
