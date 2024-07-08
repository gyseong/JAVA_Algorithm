package algorithm.src.StapbyStap;

import java.io.*;
import java.util.*;

public class BOJ_2480 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] arr =  new int[3];
        for (int i = 0;i<3;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        // 세 수가 같은 경우
        if(arr[0]==arr[1] && arr[1]==arr[2]){
            System.out.println(10000+arr[0]*1000);
        }
        // 세 수가 다른 경우
        if(arr[0] != arr[1] && arr[1]!=arr[2] && arr[0]!=arr[2]) {
            System.out.println(arr[2] * 100);
        }
        // 두 수만 같은 경우
        if(arr[0]==arr[1] && arr[0]!=arr[2]){
            System.out.println(1000+arr[1]*100);
        }else if(arr[0]==arr[2]&& arr[0] != arr[1]){
            System.out.println(1000+arr[2]*100);
        }else if(arr[1]==arr[2] && arr[1]!=arr[0]){
            System.out.println(1000+arr[1]*100);
        }
    }
}
