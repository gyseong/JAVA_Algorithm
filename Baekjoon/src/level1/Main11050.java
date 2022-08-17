package level1;

import java.util.*;
import java.io.*;

public class Main11050 {
	public static void main(String[] args) throws IOException {
		Scanner n = new Scanner(System.in);

		int a = n.nextInt();
		int b = n.nextInt();
		
		System.out.println(fac(a)/(fac(a-b)*fac(b)));

	}

	public static int fac(int a) {
		if (a <= 1)
			return 1;
		else
			return fac(a - 1) * a;
	}
}
