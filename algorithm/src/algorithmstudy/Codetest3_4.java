package algorithmstudy;

import java.util.*;
import java.io.*;

public class Codetest3_4 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str= br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b =Integer.parseInt(st.nextToken());
		int count=0;
		
		while(a>1) {
			if(a%b==0)
				a = a/b;
			else 
				a = a-1;
			count++;
		}
		System.out.println(count);
	}

}
