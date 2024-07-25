package algorithm.src.StapbyStap;

import java.io.*;
import java.util.*;

public class BOJ_3052 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];


        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine());

            // 나머지를 배열에 저장
            arr[i] = a % 42;
        }
        //sort
        Arrays.sort(arr);
        int sum = 1;

        for(int i = 1;i<10;i++){
            if(arr[i-1] != arr[i]){
                sum+=1;
            }
        }
        System.out.println(sum);
    }
}
