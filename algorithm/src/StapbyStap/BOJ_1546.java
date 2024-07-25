package algorithm.src.StapbyStap;

import java.util.*;
import java.io.*;

public class BOJ_1546 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (double)arr[i] / arr[n - 1] * 100;
        }
        System.out.println(sum / (double) n);
    }
}
