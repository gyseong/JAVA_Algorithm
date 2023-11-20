package algorithm.src.SWEA;

import java.util.*;
import java.io.*;

public class SWEA_2005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int test=1;test<=t;test++) {
            int n = Integer.parseInt(br.readLine());

            int[][] arr = new int[n+1][n+1];
            arr[0][0] = 1;

            // dp를 이용해서 푼다.
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    arr[i][j] = arr[i-1][j-1]+ arr[i-1][j];
                }
            }
            System.out.println("#"+test);
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
