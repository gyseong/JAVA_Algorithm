package level1;

import java.util.*;
import java.io.*;

public class Main8958 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		
		int a = Integer.parseInt(br.readLine());
		String[] arr = new String[a];
		StringTokenizer st;
		int sum;
		
		for (int i = 0; i < a; i++) {
			sum=0;
			arr[i] = br.readLine();
			st = new StringTokenizer(arr[i], "X");
			while (st.hasMoreTokens()) {
				String str = st.nextToken();				
				for(int j=0;j<str.length();j++) {
					sum += (j+1);
				}
			}
			list.add(sum);
		}
		for(Integer s : list) {
			System.out.println(s);
		}
	}
}
