package level1;

import java.util.*;
import java.io.*;

public class Main11047 { //coin11047
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int coin=0;
		
		int[] arr = new int[a];
		
		for(int i=0;i<a;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=arr.length-1;i>=0;i--) {
			coin += b/arr[i];
			b = b%arr[i];
		}
		System.out.println(coin);
	}
}
