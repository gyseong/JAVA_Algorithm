package algorithm.src.Codetree;

import java.util.*;
import java.io.*;
//그 계절, 그 날
public class Main1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int sum = year(y, m, d);


        if(sum==-1){
            System.out.println(sum);
        }
        else{
           season(y, m, d);
        }

    }
    public static int year(int y, int m, int d) {
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d > 31) return -1;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d > 30) return -1;
        }else if(m==2){
            int sum = year1(y,m,d);
            if(sum==-1){
                if(d>28) return -1;
            }else{
                if(d<=29)
                    return 1;
                else return -1;
            }
        }
        return 0;
    }
    //윤년 판별 함수
    public static int year1(int y, int m, int d){
        if(y%4==0){
            if(y%100==0){
                if(y%400==0){
                    return 1;
                }
                else{
                    return -1;
                }
            }
            else{
                return 1;
            }
        }
        else{
            return -1;
        }
    }
    public static void season(int y, int m, int d){
        if(3<=m &&m<=5){
            System.out.println("Spring");
        }else if(5<m && m<=8){
            System.out.println("Summer");
        }
        else if(8<m && m<=11){
            System.out.println("Fall");
        }
        else if(m==12 || m<=2){
            System.out.println("Winter");
        }
    }
}