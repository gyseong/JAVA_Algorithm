package algorithm.src.SWEA;

import java.util.*;
import java.io.*;

public class SWEA_1234 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1;i<=1;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            int[] arr = new int[a];

            for(int j=0;i<a;i++){
                arr[i] = str.charAt(j)-'0';
                System.out.print(arr[i]+" ");
            }

            for(int j=1;j<a;j++){
                if(arr[j]== arr[j-1]){
                    arr[j] =10;
                    arr[j-1] = 10;
                }
            }
            System.out.print("#"+ i+" ");
            for(int j=0;j<a;j++){
                if(arr[j]!=10){
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
    }
}
