package level1;

import java.util.*;
import java.io.*;

public class Main3036 {
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		int a = n.nextInt();
		int[] arr = new int[a];
		int count=0;
		
		for(int i=0;i<a;i++) {
			arr[i] = n.nextInt();
		}
		for(int i=1;i<a;i++) {
			count = gcd(arr[0],arr[i]);
			System.out.println(arr[0]/count +"/"+arr[i]/count);
		}
	}
	public static int gcd(int a, int b) {
		int r;
		
		while(b!=0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
