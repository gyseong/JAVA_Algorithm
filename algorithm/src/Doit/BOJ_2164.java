package algorithm.src.Doit;

import java.util.*;
import java.io.*;

public class BOJ_2164 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> list = new LinkedList<>();

        for(int i=1;i<=N;i++){
            list.add(i);
        }
        while(list.size()!=1){
            list.poll();
            list.add(list.poll());
        }
        System.out.println(list.poll());
    }
}
