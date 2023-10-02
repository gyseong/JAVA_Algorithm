package algorithm.src.FastCampus;

import java.io.*;
import java.util.*;

public class BOJ_10431 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();

        while(P>0){
            P--;
            int case1 = sc.nextInt();
            int count= 0;

            int[] arr = new int[20];

            for(int i=0;i<20;i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 1;i<20;i++){
                for(int j = i-1; j>=0; j--){
                    if(arr[j]>arr[i]) count++;
                }
            }
            System.out.println(case1+" "+count);
        }
    }
}
