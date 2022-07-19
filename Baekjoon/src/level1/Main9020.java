package level1;

import java.util.*;
import java.io.*;

public class Main9020 {
	public static boolean prime[];
	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);
		
		int a = n.nextInt();
		int min=0;
		for(int i=0;i<a;i++) {
			int b = n.nextInt();
			int first = b/2;
			int second = b/2;
			prime = new boolean[b+1];
			get_prime();
			while(true) {
				if(!prime[first]&&!prime[second]) { 
					System.out.println(first+" "+second); 
					break;
				}
				first--; 
				second++; 
			}
		}	
	}
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2;i<=Math.sqrt(prime.length);i++) {
			for(int j=i*i;j<prime.length;j+=i) {
				prime[j] = true;
			}
		}
	}
}