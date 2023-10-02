package algorithm.src.FastCampus;

import java.io.*;
import java.util.*;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                int d = str.charAt(i) - 'A';
                arr[d]++;
            } else {
                arr[str.charAt(i) - 'a']++;
            }
        }
        int max = Integer.MIN_VALUE;
        int min = -1;

        for (int i = 0; i < 26; i++) {
            if (max < arr[i]) {
                max = arr[i];
                min = i;
            }
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (max == arr[i]) {
                count++;
            }
        }
        if (count >= 2) {
            System.out.println("?");
        } else {
            System.out.println((char) ('A' + min));
        }
    }
}
