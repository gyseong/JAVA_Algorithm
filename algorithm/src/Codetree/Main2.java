package algorithm.src.Codetree;

import java.util.*;
import java.io.*;

public class Main2 {
    public static int a,b;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

       min(a,b);
        System.out.print(a + " " + b);
    }
    public static void min(int i, int j){
        if(i<j){
            a = i+10;
            b = j*2;
        }else{
            a =i*2;
            b =j+10;
        }
    }
}
