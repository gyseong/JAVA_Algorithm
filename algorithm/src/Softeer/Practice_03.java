package algorithm.src.Softeer;

import java.io.*;
import java.util.*;

public class Practice_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            sb.append(st.nextToken());
        }
        StringBuilder sb1 = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sb1.append(st.nextToken());
        }
        if(sb1.toString().contains(sb)){
            System.out.println("secret");
        }else{
            System.out.println("normal");
        }
    }
}
