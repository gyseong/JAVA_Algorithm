package level1;

import java.util.*;
import java.io.*;

public class Main2751 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<>();
		

		for (int i = 0; i < a; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		for(int val:list) {
			sb.append(val).append("\n");
		}
		System.out.println(sb);
	}
}
