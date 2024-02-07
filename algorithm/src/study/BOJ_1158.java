package algorithm.src.study;

import java.io.*;
import java.util.*;
//요세푸스 순열
public class BOJ_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        while(q.size()!=1){
            for(int i=1;i<k;i++){
                q.add(q.peek());
                q.poll();
            }
            sb.append(q.poll()+", ");
        }

        sb.append(q.poll()+">");
        System.out.println(sb);
    }
}
