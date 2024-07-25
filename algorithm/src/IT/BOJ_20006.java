package algorithm.src.IT;

import java.util.*;
import java.io.*;

public class BOJ_20006 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=0;j<n;j++){
                int a = Integer.parseInt(st.nextToken());
                q.add(a);
            }
        }
        for(int j=0;j<n-1;j++){
            q.remove();
        }
        System.out.println(q.poll());

    }
}
