package algorithm.src.FastCampus;

import java.io.*;
import java.util.*;

public class BOJ_1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int [][] arr = new int[x][y];

        // X인 위치에 1 대입
        for(int i=0;i<x;i++){
            String str = br.readLine();
            for(int j=0;j<y;j++){
                if(str.charAt(j)=='X')
                    arr[i][j]=1;
            }
        }
        int row = 0;
        //열과 행에 1이 있는지 판별
        for(int i=0;i<x;i++){
            int count = 0;
            for(int j=0;j<y;j++){
                if(arr[i][j]==0)
                    count++;
            }
            if(count==y)
                row++;
        }
        int col = 0;
        for(int i=0;i<y;i++){
            int count=0;
            for(int j=0;j<x;j++){
                if(arr[j][i]==0)
                    count++;
            }
            if(count==x)
                col++;
        }
        System.out.println(Math.max(row, col
        ));
    }
}
