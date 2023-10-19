package algorithm.src.FastCampus;

import java.io.*;
import java.util.*;

public class BOJ_2667 {
    static int[][] arr;
    static int count, n;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    count=0;
                    dfs(i, j);
                    list.add(count);
                }
            }
        }
        System.out.println(list.size());
        Collections.sort(list);
        for(int i=0;i<list.size();i++) System.out.println(list.get(i));
    }

    public static void dfs(int k, int l) {
        visited[k][l] = true;
        count++;

        for (int i = 0; i < 4; i++) {
            int k1 = k + dx[i];
            int l1 = l + dy[i];

            if (k1 < 0 || l1 < 0 || k1 >= n || l1 >= n) continue;
            if(visited[k1][l1]) continue;
            if(arr[k1][l1]==0) continue;
            dfs(k1,l1);
        }
    }
}
