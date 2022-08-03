package level1;

import java.util.*;
import java.io.*;

public class Main1934 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		for (int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			System.out.println(b*c/gcd(b,c));
		}
	}
	public static int gcd(int a,int b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
}
