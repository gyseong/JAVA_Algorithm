package algorithmstudy;

import java.util.*;
import java.io.*;

public class Codetest4_3 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int a = str.charAt(0)-'a'+1;
		int b = str.charAt(1)-'0';

		int[] dx = {2,2,-2,-2,1,-1,1,-1};
		int[] dy = {-1,1,-1,1,2,2,-2,-2};
		
		int count=0;
		
		for(int i=0;i<8;i++) {
			int nextrow = a + dx[i];
			int nextcolumn = b+dy[i];
			if(nextrow>=1&&nextcolumn>=1&&nextrow<=8&&nextcolumn<=8) {
				count++;
			}
		}
		System.out.println(count);
	}
}
