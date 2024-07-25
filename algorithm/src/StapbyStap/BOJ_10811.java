package algorithm.src.StapbyStap;

import java.util.*;
import java.io.*;

//
public class BOJ_10811 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());

            while(a<b){
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b--;
            }

        }
        for (int k = 1; k <= n; k++) {
            System.out.print(arr[k] + " ");
        }


    }
}
