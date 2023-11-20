package algorithm.src.SWEA;

import java.util.*;
import java.io.*;

public class SWEA_1959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int test = 1; test <= t; test++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];
            int[] arr1 = new int[m];


            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st1.nextToken());
            }
            for(int i=0;i<m;i++){
                arr1[i] = Integer.parseInt(st2.nextToken());
            }
            int max = Integer.MIN_VALUE;

            // m이 더 큰 경우
            if(n<m){
                for(int i=0;i<=m-n;i++){
                    int sum = 0;
                    for(int j=0;j<n;j++){
                        sum += (arr[j]*arr1[i+j]);
                    }
                    max = Math.max(sum, max);
                }
            }
            // n이 더 큰 경우
            else if(n>m){
                for(int i=0;i<=n-m;i++){
                    int sum = 0;
                    for(int j=0;j<m;j++){
                        sum += (arr1[j]*arr[i+j]);
                    }
                    max = Math.max(sum, max);
                }
            }
            // 같은 경우
            else{
                int sum = 0;
                for(int i=0;i<n;i++){
                    sum +=(arr[i]*arr1[i]);
                }
                max = sum;
            }

            System.out.println("#"+test+" "+max);
        }
    }
}
