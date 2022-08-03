package level1;

import java.util.*;
import java.io.*;

public class Main2609 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int max = 1;
		int min = 1;

		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && b % i == 0) {
				if (max < i)
					max = i;
			}
		}
		min = a*b/max;
		
		System.out.println(max);
		System.out.println(min);

	}
}
