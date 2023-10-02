package algorithm.src.Codetree;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        df(a, b);


    }
    public static void df(int a, int b){
        int max=1;
        for(int i=2;i<Math.max(a,b);i++){
            if(a%i==0 && b%i==0){
                max = i;
            }
        }
        System.out.println(a*b/max);
    }
}
