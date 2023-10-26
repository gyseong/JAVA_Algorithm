package algorithm.src.FastCampus;

import java.util.*;
import java.io.*;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][n];

        for(int i=0;i<n;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(st1.nextToken());
            }
        }
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int r1 = Integer.parseInt(st2.nextToken());
        int c1 = Integer.parseInt(st2.nextToken());

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int r2 = Integer.parseInt(st3.nextToken());
        int c2 = Integer.parseInt(st3.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=r1-1;i<r2;i++){
            for(int j=c1-1;j<c2;j++){
                if(arr[i][j]<=k){
                    list.add(arr[i][j]);
                }
            }
        }
        System.out.println(list.size());
        Collections.sort(list);

        int sum=0;
        for(int i=1;i<list.size();i++){
            if(list.get(i)!=list.get(i-1)){
                sum+=list.get(i-1);
            }
        }
        System.out.println(sum);
    }
}