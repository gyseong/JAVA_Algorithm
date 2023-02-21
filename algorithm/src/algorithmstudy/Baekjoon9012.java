package algorithmstudy;

import java.util.*;

public class Baekjoon9012 {
	public static void main(String[] args) {

		Stack<Character> stack = new Stack<>();

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int min = 0;

		for (int i = 0; i < a; i++) {
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '(') {
					stack.push(str.charAt(j));
				}

				else {
					if (stack.size() == 0) {
						stack.push(str.charAt(j));
						break;
					} else {
						stack.pop();
					}
				}
			}
			if (stack.isEmpty()) {
				System.out.println("YES");
			} else
				System.out.println("NO");
			stack.clear();
		}
	}
}
