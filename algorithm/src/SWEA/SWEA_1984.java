package algorithm.src.SWEA;

import java.util.*;
import java.io.*;
public class SWEA_1984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int j=1;j<=t;j++) {
            int [] arr = new int[10];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=0;i<10;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            long sum = 0;
            for(int i=1;i<=8;i++){
                sum+=arr[i];
            }
            double avg = (double)sum/8;

            System.out.println("#"+j+" "+ String.format("%.0f", avg));
        }
    }
}
