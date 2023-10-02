package algorithm.src.FastCampus;

import java.io.*;
import java.util.*;


public class BOJ_10158 {
    public static int dx=1,dy=1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());

        boolean flag = true;

        for (int i = 0; i < k; i++) {
            if(a==0) a+=1;
            else if(a==x) a-=1;
            if (flag) {
                a += 1;
                b += 1;
            } else {
                a -= 1;
                b -= 1;
            }
            System.out.println(a + " " + b);
        }
    }
}
