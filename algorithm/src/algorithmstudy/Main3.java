package algorithmstudy;

import java.util.*;
import java.io.*;

//모험가 길드
public class Main3 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		int a = Integer.parseInt(br.readLine());
		int result = 0;
		int count = 0;
		for (int i = 0; i < a; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list);

		for (int i = 0; i < a; i++) {
			count += 1;
			if (count >= list.get(i)) {
				result += 1;
				count = 0;
			}
		}
		System.out.println(result);
	}
}
