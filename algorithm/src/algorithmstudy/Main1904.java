package algorithmstudy;

import java.io.*;
import java.util.*;

public class Main1904 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		System.out.println(dpp(a));
	}

	public static int dpp(int a) {
		if (a == 1)
			return 1;
		if (a == 2)
			return 2;
		int zero = 1;
		int first = 2;
		int sum = 0;
		for (int i = 2; i < a; i++) {
			sum = (zero + first) % 15746;
			zero = first;
			first = sum;
		}
		return sum;
	}
}