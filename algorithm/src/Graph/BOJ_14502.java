package algorithm.src.Graph;

import java.io.*;
import java.util.*;

public class BOJ_14502 {
    static int n, m;
    static int[][] arr;
    static boolean[][] visited;

    // 시간초과는 절대 안날듯?
    // 1로 바꾸는 벽을 설정해야 한다. -> 어떤 기준으로 설정할거임?
    // 
    // 2일때 dfs하고 주변이 0이면 2로 바꿔준다.
    // 0인 개수를 출력
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // n, m 생성
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited  = new boolean[n][m];


        // 배열에 값 채워넣기
        for(int i=0;i<n;i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st1.nextToken());
            }
        }




        // 배열에서 0인것 카운트
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0) count++;
            }
        }

        System.out.println(count);
    }
}
