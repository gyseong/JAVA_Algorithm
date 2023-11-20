package algorithm.src.SWEA;


import java.util.*;
import java.io.*;

public class SWEA_1926 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i=1;i<=n;i++){
            String str = String.valueOf(i);

            if(str.contains("3") || str.contains("6") || str.contains("9")){
                for(int j=0;j<str.length();j++){
                    if(str.charAt(j)=='3' || str.charAt(j)=='6'|| str.charAt(j)=='9'){
                        sb.append("-");
                    }
                }
                sb.append(" ");
            }else{
                sb.append(i+" ");
            }
        }
        System.out.println(sb);
    }
}
