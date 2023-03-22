package algorithmstudy;

import java.util.*;
import java.io.*;
//16953
public class Main16953 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		int count = 1;
		
		
		while(b!=a) {
			if(b<a) {
				count=-1;
				break;
			}
			String str = String.valueOf(b);
			if(str.charAt(str.length()-1)!='1' && b%2!=0) {
				count = -1;
				break;
			}
			if(b%2==0) {
				b>>=1;
			}else {
				str = str.substring(0,str.length()-1);
				b = Long.parseLong(str);
			}
			count++;
		}

		System.out.println(count);
	}
}
