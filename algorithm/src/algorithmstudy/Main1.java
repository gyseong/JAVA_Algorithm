package algorithmstudy;

import java.util.*;
import java.io.*;
//곱하기 혹은 더하기

public class Main1 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		long result = str.charAt(0)-'0';
		for(int i=1;i<str.length();i++) {
			int num =str.charAt(i)-'0';
			if(result <=1 || num<=1) {
				result +=num;
			}
			else {
				result*=num;
			}
		}
		System.out.println(result);
		
	}
}
