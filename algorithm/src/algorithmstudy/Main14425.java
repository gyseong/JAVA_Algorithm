package algorithmstudy;

import java.io.*;
import java.util.*;
//14425
public class Main14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		String[] str = new String[N];
		String[] str1 = new String[M];

		for (int i = 0; i < N; i++) {
			str[i] = br.readLine();
		}
		for (int i = 0; i < M; i++) {
			str1[i] = br.readLine();
		}
		int count=0;
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(str1[i].equals(str[j])) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
