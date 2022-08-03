package level1;

import java.util.*;
import java.io.*;

public class Main5086 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str = br.readLine();

			StringTokenizer st = new StringTokenizer(str, " ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (a == b)
				break;
			else if (a > b) {
				if (a % b == 0) {
					System.out.println("multiple");
				}
				if (a % b != 0) {
					System.out.println("neither");
				}
			} else {
				if (b%a==0) {
					System.out.println("factor");
				}
			}
		}
	}
}
