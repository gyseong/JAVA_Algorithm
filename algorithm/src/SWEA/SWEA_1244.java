package algorithm.src.SWEA;

import java.util.*;
import java.io.*;

public class SWEA_1244 {
    static int[] arr;
    static boolean[] visited;
    static int max, count;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String str = st.nextToken();
            count = Integer.parseInt(st.nextToken());
            max = 0;

            arr = new int[str.length()];
            visited = new boolean[str.length()];

            // 배열 입력
            for (int j = 0; j < str.length(); j++) {
                arr[j] = str.charAt(j) - '0';
            }
            if(arr.length < count) {	// swap 횟수가 자릿수보다 클 때
                count = arr.length;	// 자릿수만큼만 옮겨도 전부 옮길 수 있음
            }
            dfs(0, 0);
            System.out.println("#" + (i + 1) + " " + max);

        }
    }

    static void dfs(int start, int cnt) {
        if (cnt == count) {
            StringBuilder sb = new StringBuilder();
            for(int a : arr) sb.append(a);
            max = Math.max(max, Integer.parseInt(sb.toString()));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                dfs(i, cnt + 1);    // 깊이 +1
                // 다시 swap 해서 되돌림
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
