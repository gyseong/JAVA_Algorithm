package level1;

import java.util.*;
import java.io.*;

public class Main7568 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int[] arr = new int[a];
		int[] arr1 = new int[a];

		for (int i = 0; i < a; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			arr[i] = Integer.parseInt(st.nextToken());
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < a; i++) {
			int count = 1;
			for (int j = 0; j < a; j++) {
				if(i==j)continue;
				if (arr[i] < arr[j] && arr1[i] < arr1[j]) { //자신보다 크면 count++로 등수를 올려주기
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
