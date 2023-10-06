package algorithm.src.FastCampus;

import java.io.*;
import java.util.*;

public class BOJ_15652 {
    static StringBuilder sb = new StringBuilder();
    public static int[] selected, visited;
    public static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        selected = new int[n+1];
        visited = new int[n+1];

        rec_func(1);
        System.out.println(sb.toString());

    }
    public static void rec_func(int k){
        if(k==m+1){
            for(int i=1;i<=m;i++) sb.append(selected[i]).append(" ");
            sb.append("\n");
        }else{
            int start = selected[k-1];
            if(start==0) start=1;
            for(int cand=start;cand<=n;cand++){
                selected[k] = cand;
                rec_func(k+1);
                selected[k] = 0;
            }
        }
    }
}
