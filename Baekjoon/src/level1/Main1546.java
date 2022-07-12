package level1;

import java.util.*;

public class Main1546 {
	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		int a = n.nextInt();
		float[] arr = new float[a];
		float[] arr1 = new float[a];
		float sum = 0;
		float avg;
		float max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = n.nextInt();
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		for(int j=0;j<arr1.length;j++) {
			arr1[j] = arr[j]/max*100;
			sum+=arr1[j];
		}
		avg = sum/arr1.length;
		System.out.println(avg);
	}
}
