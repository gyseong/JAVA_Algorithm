package level1;

import java.util.*;
import java.io.*;

public class Main2675 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner n = new Scanner(System.in);

		int a = n.nextInt();

		for (int i = 0; i < a; i++) {
			int b = n.nextInt();
			String str = n.next();

			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				for (int k = 0; k < b; k++) {
					System.out.print(ch);
				}
			}
			System.out.println();
		}
	}
}
