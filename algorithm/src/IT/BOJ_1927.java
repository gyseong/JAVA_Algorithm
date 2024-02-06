package algorithm.src.IT;

import java.util.*;
import java.io.*;

public class BOJ_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();


        for(int i=0;i<n;i++){
            int a = Integer.parseInt(br.readLine());

            if(a==0){
                if(q.size()==0){
                    sb.append(0).append("\n");
                }else{
                    sb.append(q.poll()).append("\n");
                }
            }else{
                q.add(a);
            }
        }
        System.out.println(sb);
    }
}
