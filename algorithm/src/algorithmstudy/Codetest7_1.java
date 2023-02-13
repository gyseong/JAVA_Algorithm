package algorithmstudy;

import java.util.*;
//¼øÂ÷ Å½»ö
public class Codetest7_1 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		int a = n.nextInt();
		String b = n.next();

		String[] arr = new String[a];

		for (int i = 0; i < a; i++) {
			arr[i] = n.next();
		}
		System.out.println(sort(arr, b));
	}

	public static int sort(String[] arr, String b) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (arr[i].equals(b)) {
				return i+1;
			}
		}
		return -1;
	}
}
