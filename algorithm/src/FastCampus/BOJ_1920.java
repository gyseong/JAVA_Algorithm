package algorithm.src.FastCampus;

import java.io.*;
import java.util.*;

public class BOJ_1920 {
    static int[] arr, arr1;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        m = Integer.parseInt(br.readLine());
        arr1 = new int[m];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr1[i] = Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(arr);
        search();
    }

    public static void search() {
        for (int i = 0; i < m; i++) {
            if(low_bound(arr1[i])){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
    public static boolean low_bound(int a){
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==a) return true;
            else if(arr[mid]<a){
                start  = mid+1;
            }else{
                end = mid-1;
            }
        }

        return false;
    }
}
