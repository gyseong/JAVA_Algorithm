package level1;

import java.util.*;
import java.io.*;

public class Main1316 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int count = 0;

		for (int i = 0; i < a; i++) {
			String str = br.readLine();
			if (check(str)) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean check(String str) {
		
		int prev=0;
		boolean[] check = new boolean[26];
		for(int i=0;i<str.length();i++){
			int now = str.charAt(i);
			
			if(prev!=now) {
				if(check[now-'a']==false) {
					check[now-'a']=true;
					prev=now;
				}
				else {
					return false;
				}
			}
			else {
				continue;
			}
		}
		return true;
	}
}
