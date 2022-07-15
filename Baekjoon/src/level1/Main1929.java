package level1;

import java.util.*;
import java.io.*;

public class Main1929 {
	
	public static boolean prime[];
	
	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		int a = n.nextInt();
		int b = n.nextInt();
		
		prime = new boolean[b+1];
		get_prime();
		

		for(int i=a;i<=b;i++) {
			if(prime[i]==false) {
				System.out.println(i); //a부터 b까지 소수 출력하기 
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
