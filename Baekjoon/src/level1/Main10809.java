package level1;

import java.util.*;
import java.io.*;

public class Main10809 {
	public static void main(String[] args) throws IOException {

		Scanner n = new Scanner(System.in);
		int[] arr = new int[26];
		
		for(int i=0;i<arr.length;i++) { //배열을 -1로 초기화
			arr[i] = -1;
		}
		
		String b = n.nextLine();  //문자 입력
		
		for(int j=0;j<b.length();j++) { //
			char ch = b.charAt(j);
			
			if(arr[ch-'a'] == -1) { //위치를 찾기 위해서 아스키 코드 값을 빼줌
				arr[ch - 'a'] = j;
			}
		}
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
}
