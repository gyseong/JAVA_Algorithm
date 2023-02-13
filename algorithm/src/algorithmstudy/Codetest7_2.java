package algorithmstudy;

import java.util.Scanner;
//이진탐색
public class Codetest7_2 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int a = n.nextInt();
		int target = n.nextInt();
		int[] arr = new int[a];
		
		for(int i=0;i<a;i++) {
			arr[i] = n.nextInt();
		}
		
		int result = sort(arr,0,a,target);
		
		if (result == -1) {
            System.out.println("원소가 존재하지 않습니다.");
        }
        else {
            System.out.println(result + 1);
        }
	}
	public static int sort(int[] arr,int start, int end, int target) {
	
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]==target) return mid;
			else if(arr[mid]>target)
				end = mid-1;
			else
				start = mid+1;
		}
		return -1;
	}
}
