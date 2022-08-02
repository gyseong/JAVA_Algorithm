package level1;

import java.util.*;
import java.io.*;

public class Main1541 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int sum = Integer.MAX_VALUE;
		
		StringTokenizer st = new StringTokenizer(str, "-");
	
		while(st.hasMoreTokens()) {
			int temp=0;
			
			StringTokenizer str1 = new StringTokenizer(st.nextToken(),"+");
			
			while(str1.hasMoreTokens()) {
				temp+=Integer.parseInt(str1.nextToken());
			}
			if(sum==Integer.MAX_VALUE) {
				sum =temp;
			}else {
				sum-=temp;
			}
		}
		System.out.println(sum);
	}
}