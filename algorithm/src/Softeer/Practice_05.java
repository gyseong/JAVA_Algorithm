package algorithm.src.Softeer;

import java.io.*;
import java.util.*;

public class Practice_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[4][n];
        int[][] arr1 = new int [4][n];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                arr1[i][j] = arr[i][j];
            }
        }
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<3;j++){
                sum += arr[j][i];
            }
            arr[3][i] =sum;
            arr1[3][i] = sum;
        }
        
        for(int i=0;i<4;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
