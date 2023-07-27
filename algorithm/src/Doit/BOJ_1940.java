package algorithm.src.Doit;

import java.util.*;
import java.io.*;

public class BOJ_1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count=0;

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int start=0;
        int end = n-1;

        while(start<end){
            int sum= arr[start]+arr[end];
            if(sum<m){
                start++;
            }
            else if(sum==m){
                start++;
                end--;
                count++;
            }
            else {
                end--;
            }
        }
        System.out.println(count);
    }
}
