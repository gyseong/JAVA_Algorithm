package level1;

import java.util.*;
import java.io.*;

public class Main25305 {
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		int a = n.nextInt();
		int b = n.nextInt();
		int[] arr = new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=n.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[a-b]);
	}
}
