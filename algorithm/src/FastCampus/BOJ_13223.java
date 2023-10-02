package algorithm.src.FastCampus;

import java.io.*;
import java.util.*;

public class BOJ_13223 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),":");
        StringTokenizer st1 = new StringTokenizer(br.readLine(),":");

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());
        int total = hour *3600+min*60 + sec;

        int hour1 = Integer.parseInt(st1.nextToken());
        int min1 = Integer.parseInt(st1.nextToken());
        int sec1 = Integer.parseInt(st1.nextToken());
        int total1 = hour1 *3600+min1*60 + sec1;

        int need = total1 -total;
        if(need<=0){
            need +=24*3600;
        }
        int needhour = need/3600;
        int needmin = (need%3600)/60;
        int needsec = need%60;

        System.out.println(String.format("%02d:%02d:%02d",needhour, needmin, needsec));

    }
}
