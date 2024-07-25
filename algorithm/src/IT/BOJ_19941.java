package algorithm.src.IT;

import java.util.*;
import java.io.*;


public class BOJ_19941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String str = br.readLine();
        boolean[] visited = new boolean[str.length()];

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'P') {
                for (int j = i - k; j <= i + k; j++) {
                    if (j < 0 || j >= n) continue;
                    if (!visited[j] && str.charAt(j) == 'H') {
                        visited[j] = true;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (visited[i]) count++;
        }
        System.out.println(count);
    }
}
