package level1;

import java.util.*;
import java.io.*;

public class Main1085 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int hx = 0;
		int hy = 0;
		if (x - 0 < w - x)
			hx = x - 0;
		else
			hx = w - x;

		if (y - 0 < h - y)
			hy = y - 0;

		else
			hy = h - y;
		if(hx<hy)
			System.out.println(hx);
		else
			System.out.println(hy);
			
	}
}
