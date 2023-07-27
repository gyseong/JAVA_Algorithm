package algorithm.src.Doit;
import java.util.*;
import java.io.*;

public class BOJ_11720 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum=0;
        String str = br.readLine();

        for(int i=0;i<str.length();i++) {
            sum += str.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
