package algorithm.src.study;

import java.io.*;
import java.util.*;
//BOJ 더하기 사이클
public class BOJ_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        String str = Integer.toString(n);
        int sum = 0;
        int a = n/10;
        int b = n%10;

        while(true){
            sum = a+b;
            int k = sum%10;
            int sum1 =b*10 + k;
            count++;
            if(sum1==n){
                break;
            }else{
                a = b;
                b = k;
            }
        }
        System.out.println(count);
    }
}
