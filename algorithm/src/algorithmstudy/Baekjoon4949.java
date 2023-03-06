package algorithmstudy;

import java.util.*;
import java.io.*;

public class Baekjoon4949 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			String s = br.readLine();

			if (s.equals(".")) {
				break;
			}
			sb.append(solve(s)).append('\n');
		}
		System.out.println(sb);
	}

	public static String solve(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) == ')') {
				if (stack.empty() || stack.peek() != '(') {
					return "no";
				} else {
					stack.pop();
				}
			} else if (s.charAt(i) == ']') {
				if (stack.empty() || stack.peek() != '[') {
					return "no";
				}else {
					stack.pop();
				}
			}
		}
		if(stack.isEmpty()) {
			return "yes";
		}
		else {
			return "no";
		}
	}
}
