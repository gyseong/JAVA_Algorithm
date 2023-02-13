package algorithmstudy;

import java.util.*;
import java.io.*;

public class Codetest4_1 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str, " ");

		int count = 1, count1 = 1;

		while (st.hasMoreTokens()) {
			String ch = st.nextToken();
			switch (ch) {
			case "R":
				count1 += 1;
				if (count1 == (a + 1))
					count1--;
				break;
			case "L":
				count1 -= 1;
				if (count1 == 0)
					count1++;
				break;
			case "U":
				count -= 1;
				if (count == 0)
					count++;
				break;
			case "D":
				count += 1;
				if (count == (a + 1))
					count--;
				break;
			}
		}
		System.out.println(count + " " + count1);
	}
}
