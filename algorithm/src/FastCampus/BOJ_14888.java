package algorithm.src.FastCampus;

import java.io.*;
import java.util.*;

public class BOJ_14888 {
    public static int[] arr, math, order;
    // 어떤 순서로 기록했는가 order
    // 연산자의 개수 math
    public static int n, max, min;

    static int calculator() {
        int value = arr[0];
        for (int i = 1; i <= n-1; i++) {
            if (order[i] == 1) {
                value = value + arr[i + 1];
            }
            if (order[i] == 2) {
                value = value - arr[i + 1];
            }
            if (order[i] == 3) {
                value = value * arr[i + 1];
            }
            if (order[i] == 4) {
                value = value / arr[i + 1];
            }
        }
        return value;
    }

    //order에[0..n] 에 연산자들이 순서대로 저장된다
    static void rec_func(int k) {
        if (k == n) {
            // 완성된 식에 맞게 계산을 해서 정답을 갱신하는 작업
            // 함수화를 통해서 간결하게 만들자
            int value = calculator();
            max = Math.max(max, value);
            min = Math.min(min, value);
        } else {
            //k번째 연산자는 무엇을 선택할 것인가?
            for (int cand = 1; cand <= 4; cand++) {
                if(math[cand]>0){
                    math[cand]--;
                    order[k]=cand;
                    rec_func(k+1);
                    math[cand]++;
                    order[k]=0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n+1];
        math = new int[4];
        order = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) order[i] = Integer.parseInt(st.nextToken());
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        rec_func(1);
        System.out.println(max);
        System.out.println(min);
    }
}
