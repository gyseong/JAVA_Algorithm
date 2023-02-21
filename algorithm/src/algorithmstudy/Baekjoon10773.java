package algorithmstudy;

import java.io.*;
import java.util.*;

public class Baekjoon10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Stack<Integer> stack = new Stack<>();
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=0;i<a;i++) {
			int b = sc.nextInt();
			if(b==0) {
				stack.pop();
			}
			else {
				stack.push(b);
			}
		}
		int sum=0;
		for(int i : stack) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
