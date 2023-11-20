package algorithm.src.SWEA;

import java.util.*;
import java.io.*;

public class SWEA_2817 {
    static int n, m, count;
    static int[] arr;
    static int[] selected;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int test = 1; test <= t; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            arr = new int[n];

            // 배열 완성
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st1.nextToken());
            }
            count = 0;

            rec_func(0,0);
            if(m==0) count = 0;
            System.out.println("#" + test + " " + count);

        }
    }

    static void rec_func(int k, int sum) {
      if(k==n){
          if(sum ==m){
              count++;
          }
          return;
      }
      rec_func(k+1, sum+arr[k]);
      rec_func(k+1, sum);
    }
}
