package algorithm.src.IT;

import java.util.*;

public class BOJ_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;
        int j = 2;

        if(n==1){
            System.out.println(1);
        }else{
            while(j<=n){
                j = j+(6*i);
                i++;
            }
            System.out.println(i);
        }
    }
}
