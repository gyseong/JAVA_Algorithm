package algorithm.src.Sort;

import java.util.*;
import java.io.*;

//BOJ_3273
public class BOJ_3273 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count=0,sum=0;

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int start = 0;
        int end = n-1;

        while(start<end){
            sum = arr[start] + arr[end];

            if(sum==k){
                count++;
                start++;
            }
            else if(sum<k){
                start++;
            }
            else {
                end--;
            }
        }
        System.out.println(count);
    }
}
