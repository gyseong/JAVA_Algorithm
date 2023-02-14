package algorithmstudy;

import java.util.*;
import java.io.*;

public class Main12 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		Integer[] arr = new Integer[a];
		Integer[] arr1 = new Integer[a];
		int result = 0;
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for(int i=0;i<a;i++) {
			arr[i] = Integer.parseInt(st1.nextToken());
			arr1[i] = Integer.parseInt(st2.nextToken());
		}
		
		Arrays.sort(arr);
		Arrays.sort(arr1, Collections.reverseOrder());
		for(int i=0;i<b;i++) {
			if(arr[i]<arr1[i]) {
				int temp = arr[i];
				arr[i] = arr1[i];
				arr1[i] = temp;
			}
		}
		for(int i=0;i<a;i++) {
			result +=arr[i];
		}
		System.out.println(result);
	}
}
