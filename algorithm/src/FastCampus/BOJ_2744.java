package algorithm.src.FastCampus;

import java.io.*;

public class BOJ_2744 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        for(int i=0;i<str.length();i++){
            if('A'<=str.charAt(i)&& str.charAt(i)<='Z'){
                int d = str.charAt(i)+32;
                char d1 = (char)d;
                sb.append(d1);
            }else{
                int k = str.charAt(i)-32;
                char k1 = (char)k;
                sb.append(k1);
            }
        }
        System.out.println(sb);
    }

}
