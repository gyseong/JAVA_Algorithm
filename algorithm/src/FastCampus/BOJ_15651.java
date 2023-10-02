package algorithm.src.FastCampus;

import java.io.*;
import java.util.*;

public class BOJ_15651 {
    static int n, m;
    static StringBuilder sb = new StringBuilder();
    static int[] selected;
    //재귀 방법을 사용한 것임

    public static void ref_cnc(int k) {
        if (k == m + 1) { // 다 고른경우
            //selected배열이 새롭게 탐색된 결과
            for (int i = 1; i <= m; i++) sb.append(selected[i]).append(" ");
            sb.append("\n");
        } else {
            for (int cand = 1; cand <= n; cand++) {
                selected[k] = cand;
                //k+1번 ~m번까지 모두 탐색하는 상황
                ref_cnc(k+1);
                selected[k]=0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        selected = new int[n + 1];

        ref_cnc(1);
        System.out.println(sb.toString());
    }
}
