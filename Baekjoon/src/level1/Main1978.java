package level1;

import java.util.*;
import java.io.*;
//소수 개수
public class Main1978 { 
	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		int a = n.nextInt();
		int count=0;
		
		for(int i=0;i<a;i++) {
			int b = n.nextInt();
			if(prime(b)) {
				count++;
			}
		}
		System.out.println(count);
		
	}

	static boolean prime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i*i <= num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
