package algorithm.src.Sort;

import java.util.*;
import java.io.*;
/*
    소트인사이드 - 실버 5
 */
public class BOJ_1427 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        Integer[] arr = new Integer[str.length()];

        for(int i=0;i<arr.length;i++){
            char ch = str.charAt(i);
            arr[i] = ch-'0';
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
