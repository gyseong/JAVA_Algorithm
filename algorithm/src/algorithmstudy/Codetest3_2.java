package algorithmstudy;

import java.util.*;
import java.io.*;

public class Codetest3_2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str, " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int[] arr = new int[a];
		
		String str1 = br.readLine();
		StringTokenizer st1 = new StringTokenizer(str1, " ");
		for (int i = 0; i < a; i++) {
			arr[i] = Integer.parseInt(st1.nextToken());
		}
		Arrays.sort(arr);

		int fir = arr[a - 1];
		int sec = arr[a - 2];
		int sum = 0;
		
		int cnt = (b/(c+1))*c; //일정 수열이 반복니까 계산한 결과
		cnt += b%(c+1);
	
		sum += cnt*fir;
		sum += (b-cnt)*sec;
		
		System.out.println(sum);
	}
}
