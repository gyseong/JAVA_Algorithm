package algorithm.src.SWEA;


import java.util.*;
import java.io.*;


public class SWEA_1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int test = 1; test <= t; test++) {
            int n = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            String[] arr = new String[n];
            int[] arr1 = new int[n];
            String str ="";
            for(int i=0;i<n;i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                arr[i] = st.nextToken();
                arr1[i] = Integer.parseInt(st.nextToken());
            }
            int count = 0;

            System.out.println("#"+test);
            for(int i=0;i<n;i++){
                for(int j=0;j<arr1[i];j++){
                    System.out.print(arr[i]);
                    count++;
                    if(count==10){
                        System.out.println();
                        count=0;
                    }
                }
            }
            System.out.println();
        }
    }
}
