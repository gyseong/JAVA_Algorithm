package algorithmstudy;

import java.io.*;
import java.util.*;

//11000

public class Main11000 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] ST = new int[N][2];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			ST[i][0] = Integer.parseInt(st.nextToken());
			ST[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(ST,new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0]-o2[0];
			}
		});
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.offer(ST[0][1]);
		for(int i=1;i<N;i++) {
			if(q.peek()<=ST[i][0]) {
				q.poll();
			}
			q.add(ST[i][1]);
		}
		System.out.println(q.size());
	}
}
