package algorithm.src.BackTracking;

import java.util.*;
import java.io.*;

public class BOJ_1107 {
    static int n, m, plus_count = 0, minus_count = 0;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열로 한번 입력 받아야됨 그래야 나중에 자리 수 더해줄 때 사용
        String str = br.readLine();
        visited = new boolean[10];

        n = Integer.parseInt(str);
        m = Integer.parseInt(br.readLine());


        int[] arr = new int[m];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            visited[arr[i]] = true;
        }

        // N이 100이면 그냥 종료시켜버리자
        if (n == 100) {
            System.out.println(0);
            return;
        }

        // 더하기 로직을 하나 만들어준다.
        // 그리고 visited 배열에 값이 있는지 없는지 검사를 반복
        rec_plus();

        // 빼기 로직을 하나 만들어준다.
        // 그리고 visited 배열에 값이 있는지 없는지 검사를 반복
        rec_minus();

        System.out.println(Math.min(plus_count, minus_count));
    }

    static void rec_plus() {
        while (true){
            for(int i=0;i<10;i++){
            }
        }
    }

    static void rec_minus() {
        while (true){

        }
    }
}
