package algorithm.src.Sort;

import java.util.*;
import java.io.*;

// 통계학
public class BOJ_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] count = new int[8001];

        int sum = 0;
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
            count[arr[i]+4000]++;
        }

        Arrays.sort(arr);

        // 산술평균
        System.out.println((int)Math.round((double)sum/n));

        // 중앙값
        System.out.println(arr[n/2]);

        // 최빈값
        int max = 0;
        int max1 =0;

        boolean check = false;

        for(int i=arr[0]+4000;i<=arr[n-1]+4000;i++) {
            if(count[i]>0) {
                if(max<count[i]) {
                    max = count[i];
                    max1 = i-4000;
                    check = true;
                }
                else if(max==count[i] && check) {
                    max1 = i-4000;
                    check = false;
                }
            }
        }
        System.out.println(max1);
        // 범위
        System.out.println(arr[n-1]-arr[0]);
    }
}