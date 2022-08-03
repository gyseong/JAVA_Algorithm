package level1;

import java.util.*;
import java.io.*;

public class Main1037 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");

		while (a-- > 0) {
			int n = Integer.parseInt(st.nextToken());
			max = n > max ? n : max;
			min = n < min ? n : min;
		}
		System.out.println(max * min); //MAX*MIN solution
	}
}
