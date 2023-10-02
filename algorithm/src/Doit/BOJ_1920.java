package algorithm.src.Doit;

import java.io.*;
import java.util.*;

public class BOJ_1920 {
    public static int a, b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        b = Integer.parseInt(br.readLine());
        int[] arr1 = new int[b];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < b; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
            boolean k = bina(arr, arr1[i]);

            if(!k) System.out.println("0");
            else System.out.println("1");
        }
    }

    public static boolean bina(int[] arr, int arr1) {
        return Arrays.binarySearch(arr, arr1)>=0;
    }
}
