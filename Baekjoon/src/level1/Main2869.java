package level1;

import java.util.*;
import java.io.*;

public class Main2869 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str, " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int count = (c-b)/(a-b);
		
		if((c-b)%(a-b)!=0) {
			count++;
		}

		System.out.println(count);
	}
}
