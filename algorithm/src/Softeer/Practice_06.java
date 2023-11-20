package algorithm.src.Softeer;

import java.io.*;
import java.util.*;
public class Practice_06 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        // 배열 입력
        for(int i=1;i<=n;i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        //두 값 입력 받아서 평균 구하기
        for(int i=0;i<k;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            int sum=0;

            for(int j=a;j<=b;j++){
                sum+=arr[j];
            }
            double avg = (double)(sum)/(double)((b-a+1));
            System.out.println(Math.round(avg*100)/100.0);
        }
    }
}

