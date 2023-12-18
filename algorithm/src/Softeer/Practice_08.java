package algorithm.src.Softeer;

import java.sql.Array;
import java.util.*;
import java.io.*;

public class Practice_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int[] arr = new int[n + 1];

        // 배열 생성
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) list.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }
        for(int i=1;i<=n;i++){
            boolean check = true;
            for(int j=0;j<list.get(i).size();j++){
                if(arr[i] <= arr[list.get(i).get(j)]) {
                    check = false;
                    break;
                }
            }
            if(check)count++;
        }
        System.out.println(count);
    }
}
