package algorithm.src.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_5215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] one = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};
        int t = Integer.parseInt(br.readLine());

        for (int test = 1; test <= t; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 학생 수
            int n = Integer.parseInt(st.nextToken());
            // 학생의 번호
            int k = Integer.parseInt(st.nextToken());

            double[] score = new double[n];

            for (int i = 0; i < n; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st1.nextToken());
                int b = Integer.parseInt(st1.nextToken());
                int c = Integer.parseInt(st1.nextToken());

                score[i] = a * 0.35 + b * 0.45 + c * 0.2;
            }
            // 배열 정렬

            String ans = "";
            double goal = score[k - 1];
            Arrays.sort(score);

            for (int i = 0; i < n; i++) {
                if (goal == score[i]) {
                    ans = one[i / (n / 10)];
                    break;
                }
            }

            System.out.println("#" + test + " " + ans);
        }
    }
}
