package algorithm.src.study;

import java.util.*;
import java.io.*;

public class BOJ_9375 {

    // 알몸인 경우, 하나씩만 입는 경우, 그리고 조합으로 입는 경우 생각해야 됨
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> hash = new HashMap<>();

            int avg = 1;
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                String str1 = st.nextToken();
                String str2 = st.nextToken();

                // 배열에 옷 type 넣어주기
                if (hash.containsKey(str2)) {
                    // 포함되어 있다면?
                    hash.put(str2, hash.getOrDefault(str2, 0) + 1);
                } else {
                    // 포함되어 있지 않다면 1로 추가
                    hash.put(str2, 1);
                }
            }

            for(String str : hash.keySet()){
                avg *=(hash.get(str)+1);
            }
            // 알몸 제거
            System.out.println(avg-1);
        }
    }
}

