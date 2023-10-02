package algorithm.src.FastCampus;

import java.io.*;
import java.util.*;

public class BOJ_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int P = Integer.parseInt(br.readLine());

        int[] arr = new int[10001];
        for(int i=0;i<P;i++){
            arr[Integer.parseInt(br.readLine())]++;
        }

        for(int i=1;i<10001;i++){
            while(arr[i]-- >0){
                bw.write(i+"\n");
            }
        }
        bw.flush();
    }
}
