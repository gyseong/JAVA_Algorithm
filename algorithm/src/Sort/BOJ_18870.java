package algorithm.src.Sort;

import java.io.*;
import java.util.*;

public class BOJ_18870 {
    public static int a;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine());

        long[] arr = new long[a];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < a; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

    }
}
