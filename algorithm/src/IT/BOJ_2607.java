package algorithm.src.IT;

import java.util.*;
import java.io.*;

public class BOJ_2607 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        String str = br.readLine();


        for (int i = 0; i < n - 1; i++) {
            String str1 = br.readLine();
            int count1 = 0;
            int[] arr = new int[26];

            for (int j = 0; j < str.length(); j++) {
                arr[str.charAt(j) - 'A']++;
            }

            for(int j=0;j<str1.length();j++){
                if(arr[str1.charAt(j)-'A']>0){
                    count1++;
                    arr[str1.charAt(j)-'A']--;
                }
            }
            // 길이가 같은 경우에서, 문자 구성이 다 같은 경우 또는 -1인 경우
            if(str1.length()==str.length() && (str.length()==count1 || str.length()-1 ==count1)){
                count++;
            }
            if(str.length()==str1.length()+1 && str1.length()==count1){
                count++;
            }
            if(str.length()==str1.length()-1 && str1.length()-1==count1){
                count++;
            }
        }
        System.out.println(count);
    }
}
