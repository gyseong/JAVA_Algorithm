package level1;

import java.util.*;
import java.io.*;

public class Main2981 {
	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		int a = n.nextInt();
		int[] arr = new int[a];
		
		for (int i = 0; i < a; i++) {
			arr[i] = n.nextInt();
		}
		Arrays.sort(arr);
		int gcdval = arr[1]-arr[0];
		
		for(int i=2;i<a;i++) {
			gcdval = gcd(gcdval, arr[i]-arr[i-1]);
		}
		for(int i=2;i<=gcdval;i++) {
			if(gcdval%i==0) {
				System.out.println(i+" ");
			}
		}
	}
	static int gcd(int a, int b) {
		while(b!=0) {
			int r = a%b;
			a=b;
			b=r;
		}
		return a;
	}
}
