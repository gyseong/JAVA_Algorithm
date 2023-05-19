package algorithm.src.Sort;

import java.util.*;
import java.io.*;
//BOJ_2110
public class BOJ_2110 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count=1;

        int[][] arr = new int[n][2];

        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        q.add(arr[0][1]);

        for(int i=1;i<n;i++){
            if(q.peek()<=arr[i][0])
                q.poll();
            q.add(arr[i][1]);
        }
        System.out.println(q.size());
    }
}
