package algorithm.src.Softeer;

import java.io.*;
import java.util.*;

public class Practice_07 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n];

        for(int i=0;i<n;i++){
            dp[i] = 1;
        }
        //i 번째 돌을 밞을 최대 개수
        for(int i=0;i<n;i++){
            //i번째 돌을 밟을 최대 개수 탐색 시작
            for(int j=0;j<=i;j++){
                //그 다음 돌이 현재보다 높이가 높을 때
                if(arr[i]>arr[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }

        Arrays.sort(dp);
        System.out.println(dp[n-1]);
    }
}
