package algorithmstudy;

import java.util.*;
import java.io.*;

public class Baekjoon1931 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		int[][] arr = new int[a][2];

		for (int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1]==o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		
		int count = 0;
		int endtime = 0;
		
		for(int i=0;i<a;i++) {
			if(endtime<=arr[i][0]) {
				endtime = arr[i][1];
				count++;
			}
		}
		System.out.println(count);
	}
}
