package algorithm.src.SWEA;

import java.util.*;
import java.io.*;

public class SWEA_2007 {
    // 알파벳 배열을 만들어서 -> 있으면 카운트 증가 -> 배열을 돌면서 0이 아닌 값만 세줌
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            int[] alpha = new int[26];
            int min = Integer.MAX_VALUE;
            String str = br.readLine();

            int count = 0;
            for(int j=0;j<str.length();j++){
                char c = str.charAt(j);
                if (c >= 'A' && c <= 'Z') {
                    alpha[c - 'A']++; // 유효한 범위 내의 문자만 처리
                }
            }
            //0이 아닌 값들 중 최소값 구하자!
            for(int j=0;j<26;j++){
                if(alpha[j]!=0 && min>alpha[j]){
                    min = alpha[j];
                }
            }
            for(int j=0;j<26;j++){
                if(alpha[j]!=0){
                    count += alpha[j]/min;
                }
            }
            sb.append("#"+(i+1)).append(" "+ count).append("\n");
        }

        System.out.println(sb);
    }
}
