package algorithm.src.BackTracking;

import java.util.*;
import java.io.*;

public class BOJ_1476 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        int e1=0, s1=0, m1=0;
        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        while(true){
            count++;
            e1++;
            s1++;
            m1++;
            if(e1==16) e1 = 1;
            if(s1==29) s1 = 1;
            if(m1==20) m1 = 1;

            if(e1==e && s1==s && m1==m) break;
        }
        System.out.println(count);
    }
}
