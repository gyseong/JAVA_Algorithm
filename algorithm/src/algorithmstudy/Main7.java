package algorithmstudy;

import java.lang.reflect.Array;
import java.util.*;
//문자열 재정렬

public class Main7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		ArrayList<Character> list = new ArrayList<>();
		int result=0;
		
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(str.charAt(i))) {
				list.add(str.charAt(i));
			}
			else {
				result +=str.charAt(i)-'0';
			}
		}
		
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
		 if (result != 0) System.out.print(result);
	}

}
