package algorithm.src.IT;

import java.util.*;
import java.io.*;

public class BOJ_23971 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int sum = 0;

        int height = (H - 1) / (N + 1) + 1;
        int width = (W - 1) / (M + 1) + 1;
        System.out.println(height * width);
    }
}
