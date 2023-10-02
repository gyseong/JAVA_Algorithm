package algorithm.src.FastCampus;
import java.io.*;
import java.util.*;
public class BOJ_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String str ="";

       while(n>0){
           int k = n%b;
           if(k<10) str+=k;
           else str+=((char)(k-10+'A'));
           n/=b;
       }
       for(int i=str.length()-1;i>=0;i--){
           System.out.print(str.charAt(i));
       }
    }
}
