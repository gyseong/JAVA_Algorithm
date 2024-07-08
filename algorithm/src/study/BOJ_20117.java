package algorithm.src.study;

import java.util.*;
import java.io.*;
//호반우 상인의 이상한 품질 계산법
public class BOJ_20117 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int mid = n/2;
        int count = 0;

        if(n%2==0){
            for(int i=mid;i<n;i++){
                count +=(arr[i]*2);
            }
        }else{
            for(int i=mid+1;i<n;i++){
                count +=(arr[i]*2);
            }
            count += arr[mid];
        }
        System.out.println(count);
    }
}
