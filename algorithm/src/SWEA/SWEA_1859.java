package algorithm.src.SWEA;

import java.util.*;
import java.io.*;

public class SWEA_1859 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            long money = 0;
            int min = 0;
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            //배열 입력
            for(int j=0;j<n;j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for(int j=n-1;j>=0;j--) {
                if (arr[j]>min)min = arr[j];
                money += min - arr[j];
            }
            System.out.println("#"+(i+1)+" "+ money);
        }
    }
}
