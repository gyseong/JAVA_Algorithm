package algorithm.src.Stack;

import java.util.*;
import java.io.*;
import java.awt.*;
public class BOJ_1873 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        int j=0;

        while(n-->0){
            int value = Integer.parseInt(br.readLine());

            if(value>j){
                for(int i=j+1;i<=value;i++){
                    s.push(i);
                    sb.append("+").append("\n");
                }
                j = value;
            }
            if(value != s.peek()){
                System.out.println("NO");
                System.exit(0);
            }
            s.pop();
            sb.append("-").append("\n");

        }
        System.out.println(sb);
    }
}
