package level1;

import java.util.*;
import java.io.*;
import java.lang.annotation.Native;

public class Main4948 {
	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		int count;

		while (true) {
			int a = n.nextInt();
			if (a == 0) {
				break;
			} else {
				count=0;
				for (int i = a+1; i <= 2 * a; i++) {
					if (prime(i))
						count++;
				}
				System.out.println(count);
			}
		}
	}

	static boolean prime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
