package algorithmstudy;

import java.util.*;
import java.io.*;

public class Baekjoon1946 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		
		for(int i=0;i<a;i++) {
			int b = Integer.parseInt(br.readLine());
			int[][] arr = new int[b][2];
			int count=1;
			for(int j=0;j<b;j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				arr[j][0] = Integer.parseInt(st.nextToken());
				arr[j][1] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr, new Comparator<int []>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					// TODO Auto-generated method stub
					return o1[0]-o2[0];
				}
				
			});
			
			int min = arr[0][1];
			for(int j=1;j<b;j++) {
				if(arr[j][1]<min) {			
					min = arr[j][1];
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
