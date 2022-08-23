package level1;

import java.util.*;
import java.io.*;

public class Main3009 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] x = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
		st = new StringTokenizer(br.readLine(), " ");
		int[] y = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
		st = new StringTokenizer(br.readLine(), " ");
		int[] z = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };

		int x1, y1;

		if (x[0] == y[0]) {
			x1 = z[0];
		} else if (x[0] == z[0])
			x1 = y[0];
		else
			x1 = x[0];
		
		if (x[1] == y[1]) {
			y1 = z[1];
		} else if (x[1] == z[1])
			y1 = y[1];
		else
			y1 = x[1];
		
		System.out.println(x1 + " " + y1);
	}
}
