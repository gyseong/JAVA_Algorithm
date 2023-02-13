package algorithmstudy;

import java.util.*;
import java.io.*;
//1이 될 때까지
public class Main {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = 0;
		while(true) {
			if(a%b==0) {
				a /=b;
				result++;
				if(a==1) break;
			}
			else {
				a -=1;
				result++;
				if (a==1) break;
			}
		}
		System.out.println(result);
	}
}
