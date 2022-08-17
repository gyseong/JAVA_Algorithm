package level1;

import java.util.*;
import java.io.*;

public class Main11651 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int[][] arr = new int[a][2];
		
		StringTokenizer st;
		
		for(int i=0;i<a;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr,(e1,e2)->{
			if(e2[1] == e1[1]) {
				return e1[0] - e2[0];
			}else {
				return e1[1]-e2[1];
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			sb.append(arr[i][0]+" "+arr[i][1]).append("\n");
		}
		System.out.println(sb);
	}
}
