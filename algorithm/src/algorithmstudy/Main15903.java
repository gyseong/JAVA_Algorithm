package algorithmstudy;

import java.util.*;
import java.io.*;
//15903
public class Main15903 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		long[] arr = new long[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(arr);
		
		for(int i=0;i<m;i++) {
			arr[0] +=arr[1];
			arr[1] = arr[0];
			Arrays.sort(arr);
		}
		long sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}
