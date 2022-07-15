package level1;

import java.util.*;
import java.io.*;

public class Main4673 {
	public static int arr[];
	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
		
		for(int i=1;i<10001;i++) {
			int n = d(i);
			
			if(n<10001)
				check[n]=true;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<10001;i++) {
			if(!check[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}
	public static int d(int a) {
		int sum = a;
		
		while(a!=0) {
			sum +=(a%10);
			a = a/10;
		}
		return sum;
	}
}
