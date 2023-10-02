package algorithm.src.FastCampus;

import java.io.*;
import java.util.*;
public class BOJ_1919 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String str1 = br.readLine();

        int[] arr = new int[26];
        int[] arr1 = new int[26];

        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        for(int i=0;i<str1.length();i++){
            arr1[str1.charAt(i)-'a']++;
        }
        int count=0;

        // count += Math.abs(arr[i], arr1[i]);
        for(int i=0;i<26;i++) {
            if (arr[i] < arr1[i])
                count += arr1[i] - arr[i];
            else
                count += arr[i] - arr1[i];
        }
        System.out.println(count);
    }
}
