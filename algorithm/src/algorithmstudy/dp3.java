package algorithmstudy;

import java.io.*;
import java.util.*;
//개미전사
public class dp3 {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] arr = new int[a];
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<a;i++) {
			arr[i] = sc.nextInt();
		}
		list.add(arr[0]);
		list.add(Math.max(arr[0], arr[1]));
		for(int i=2;i<a;i++) {
			list.add(Math.max(arr[i-1],arr[i-2]+arr[i]));
		}
		System.out.println(list.get(a-1));
	}
}
