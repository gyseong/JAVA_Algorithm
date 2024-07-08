package algorithm.src.study;

import java.util.*;
import java.io.*;
//A+B-C

public class BOJ_31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        System.out.println(a+b-c);
        String str =String.valueOf(a)+String.valueOf(b);
        int k = Integer.parseInt(str)-c;
        System.out.println(k);
    }
}
