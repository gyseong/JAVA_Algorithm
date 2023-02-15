package algorithmstudy;

import java.io.*;
import java.util.*;

public class Baekjoon2217 {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] arr = new int[a];
		sc.nextLine();
		
		for(int i=0;i<a;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int result = 0;
		for(int i = a-1;i>=0;i--) {
			arr[i] = arr[i]* (a-i);
			if(result<arr[i]) result = arr[i];
		}
		System.out.println(result);
	}
}
