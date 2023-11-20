package algorithm.src.SWEA;

import java.util.*;
import java.io.*;

public class SWEA_6190 {
    static  int [] arr;
    static  int[] selected;
    static int n,max;
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int test = 1; test <= t; test++) {

            n = Integer.parseInt(br.readLine());

            arr = new int[n];
            selected = new int[2];
            max = 1;

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            /*
            rec_func(0);

            Collections.sort(list);
            if(list.size()==0){
                System.out.println("#"+test+" "+-1);
            }else{
                System.out.println("#"+test+" "+list.get(list.size()-1));
            }*/

            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int sum = arr[i]* arr[j];
                    check(sum);
                }
            }
            System.out.println("#"+test+" "+max);
        }
    }
    static void check(int sum){
        boolean flag = true;
        String str = Integer.toString(sum);
        for(int i=0;i<str.length()-1;i++) {
            if (str.charAt(i) - '0' > str.charAt(i + 1) - '0') {
                flag = false;
                break;
            }
        }
        if(flag){
            max = Math.max(sum,max);
        }
    }
    static void rec_func(int k){
        // 완탐
        if(k==2){
            int sum = 1;
            for(int i=0;i<2;i++){
                sum *=selected[i];
            }
            // 판별하고 list에 집어 넣자.
            String str = Integer.toString(sum);

            boolean flag = false;
                int max = str.charAt(0)-'0';
                for(int i=1;i<str.length();i++){
                    if(max<str.charAt(i)-'0'){
                        max = str.charAt(i)-'0';
                        flag = true;
                    }else{
                        flag = false;
                        break;
                    }
                }
            if(flag) list.add(sum);
        }else{
            for(int cand = 0;cand<n;cand++){
                boolean check = false;
                for(int i=0;i<k;i++){
                    if(arr[cand]== selected[i]){
                        check = true;
                    }
                }
                if(!check){
                    selected[k] = arr[cand];
                    //k+1번부터 m==2 까지 모두 탐색하는 일을 해야
                    rec_func(k+1);
                    selected[k] = 0;
                }
            }
        }
    }
}