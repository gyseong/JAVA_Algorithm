package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = a * b * c;
		String str = String.valueOf(d);

		System.out.println(count(str, '0'));
		System.out.println(count(str, '1'));
		System.out.println(count(str, '2'));
		System.out.println(count(str, '3'));
		System.out.println(count(str, '4'));
		System.out.println(count(str, '5'));
		System.out.println(count(str, '6'));
		System.out.println(count(str, '7'));
		System.out.println(count(str, '8'));
		System.out.println(count(str, '9'));
	}

	public static int count(String str, char st) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == st) {
				count++;
			}
		}
		return count;
	}
}