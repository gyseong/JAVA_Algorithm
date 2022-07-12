package level1;

import java.util.*;
import java.io.*;

public class Main4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());

		int[] arr;
		int[] arr1;
		
		for (int i = 0; i < a; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			
			int n = Integer.parseInt(st.nextToken());
			arr = new int[n];
			double sum = 0;
			
			for(int j=0;j<n;j++) {
				int val = Integer.parseInt(st.nextToken());
				arr[j]=val;
				sum+=val;
			}
			double avg = (sum/n);
			double count=0;
			
			for(int k=0;k<n;k++) {
				if(arr[k]>avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/n)*100);
		}
	}
}
