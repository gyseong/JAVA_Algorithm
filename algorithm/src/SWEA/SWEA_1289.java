package algorithm.src.SWEA;

import java.util.*;
import java.io.*;

public class SWEA_1289 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int test=1;test<=t;test++) {
            String str = br.readLine();
            int count=0;
            // 배열 생성 -> 0
            int[] arr = new int[str.length()];
            boolean flag = true;

            for(int i=0;i<str.length();i++){
                // a와 비교
                int a = str.charAt(i)-'0';
                // 다르다면
                if(arr[i]!=a){
                    // 교환
                    if(arr[i]==1){
                        for(int j=i;j<str.length();j++){
                            arr[j] = 0;
                        }
                    }
                    else {
                        for (int j = i; j < str.length(); j++) {
                            arr[j] = 1;
                        }
                    }
                    count++;
                }else{
                    continue;
                }
            }
            System.out.println("#"+test+" "+count);
        }
    }
}
