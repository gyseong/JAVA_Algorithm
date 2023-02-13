package algorithmstudy;
import java.util.*;
import java.io.*;
//배열에서 최댓값과 최솟값을 바꾸기

public class Codetest6_12 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int sum=0;
		int[] arr = new int[a];
		int[] arr1 = new int[a]; //배열의 내림 차순을 적용하기 위해서는 Integer로 선언
		
		for(int i=0;i<a;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<a;i++) {
			arr1[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		Arrays.sort(arr1);
		for(int i=0;i<b;i++) {
			int temp = arr[i];
			arr[i] = arr1[(a-1)-i];
			arr1[a-1] = temp;
		}
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		System.out.println(sum);
	}
}
