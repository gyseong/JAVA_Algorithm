package algorithm.src.BackTracking;

import java.util.*;
import java.io.*;

public class BOJ_2309 {
    static int sum, n, m, max = Integer.MIN_VALUE;
    static int[] selected;
    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        selected = new int[n + 1];
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        rec_func(1, 1);

        System.out.println(max);
    }

    static void rec_func(int k, int j) {
        // 탐색을 끝 마쳤을때
        if (k == 4) {
            sum = 0;
            // 합을 구해서
            for (int i = 1; i < 4; i++) sum += selected[i];

            // target을 넘는지 비교
            if (sum <= m) {
                // 넘지 않는다면 sum과 max값 갱신
                max = Math.max(max, sum);
            }
        } else {
            // j부터 시작해서 순서가 안겹치게 한다.
            for (int cand = j; cand <= n; cand++) {
                boolean check = true;

                // 중복 제거
                for (int i = 1; i <= k; i++) {
                    if (selected[i] == arr[cand]) check = false;
                }
                if (check) {
                    selected[k] = arr[cand];
                    rec_func(k + 1, j + 1);
                    selected[k] = 0;
                }
            }
        }
    }
}
