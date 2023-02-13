package algorithmstudy;

import java.util.*;

public class Baekjoon1254 {
	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		ArrayList<String> arr = new ArrayList<>();
		String[] s1 = new String[50];
		Scanner n = new Scanner(System.in);
		String str = n.next();
		String s2 = null;
		arr.add(str);
		String[] strArray = str.split(""); // 문자열 분리
		int i = 0;

		StringBuffer sb = new StringBuffer(str);
		String reverse = sb.reverse().toString(); // 문자열 뒤집기

		if (str.equals(reverse)) {
			System.out.println(str.length()); // 문자열 그냥 필랜드롬인거 출력
		} else {
			for (String s : strArray) {
				stack.push(s);
			}
			while (stack.empty() != true) {
				s1[i] = stack.pop();
				s2 = str + s1[i];

				StringBuffer sb1 = new StringBuffer(s2);
				reverse = sb1.reverse().toString();

				if (s2.equals(reverse)) {
					System.out.println(s2.length());
					break;
				} else {
					arr.add(s1[i]);
					String s = String.join("", arr);
					StringBuffer sb2 = new StringBuffer(s);
					reverse = sb2.reverse().toString();
					if (s.equals(reverse)) {
						System.out.println(s);
						System.out.println(s.length());
					}
				}
				i++;
			}
		}
	}
}
