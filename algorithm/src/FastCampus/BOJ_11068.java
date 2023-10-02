package algorithm.src.FastCampus;

import java.io.*;
import java.util.*;

public class BOJ_11068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            int a = Integer.parseInt(br.readLine());
            boolean ch = false;
            for(int j=2;j<=64;j++){
                ch = check(a, j);
                if(ch) break;
            }
            if(ch) System.out.println(1);
            else System.out.println(0);
        }
    }
    public static boolean check(int a, int i){

        ArrayList<Integer> list = new ArrayList<>();

        while(a>0){
            list.add(a%i);
            a/=i;
        }

        for(int j=0;j<list.size()/2;j++){
            if(list.get(j)!=list.get(list.size()-1-j)) return false;
        }
        return true;
    }
}
