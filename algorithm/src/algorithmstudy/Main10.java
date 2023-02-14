package algorithmstudy;

import java.util.*;
import java.io.*;
//선택정렬
public class Main10 {
	public static void main(String[] args) {
		
		int[] arr = {2,3,5,6,7,9,8,0,1};
		
		for(int i=0;i<arr.length;i++) {
			int min = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j])
					min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
