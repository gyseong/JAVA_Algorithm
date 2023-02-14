package algorithmstudy;

import java.util.*;
import java.io.*;
//»ğÀÔ Á¤·Ä
public class Main11 {
	public static void main(String[] args) {
		int[] arr = {2,4,3,5,6,7,9,8,0,1};
		
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]= temp;
				}
				else
					break;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
