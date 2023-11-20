package algorithm.src.SWEA;

import java.util.*;
import java.io.*;

public class SWEA_1974 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int j=1;j<=t;j++) {
            int [][] arr = new int[9][9];
            int count = 0;
            boolean flag = true;

            // 배열 입력
            for(int i=0;i<9;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int l=0;l<9;l++){
                    arr[i][l] = Integer.parseInt(st.nextToken());
                }
            }

            // 열 판별
            for(int i=0;i<9;i++){
                int[] num = new int[10];
                for(int l =0;l<9;l++){
                    num[arr[i][l]]++;
                }
                for(int l=1;l<=9;l++){
                    if(num[l]==0){
                        flag = false;
                        break;
                    }
                }
            }

            // 행 판별
            for(int i=0;i<9;i++){
                int[] num = new int[10];
                for(int l = 0; l<9;l++){
                    num[arr[l][i]]++;
                }
                for(int l=1;l<=9;l++) {
                    if (num[l] == 0) {
                        flag = false;
                        break;
                    }
                }
            }

            //3*3 격자 판별
            for(int i=0;i<=6;i+=3){
                for(int k=0;k<=6;k+=3){
                    int[] num = new int[10];
                    for(int l = i; l<i+3;l++){
                        for(int m = k; m<k+3;m++){
                            num[arr[l][m]]++;
                        }
                    }
                    for(int l = 1;l<=9;l++){
                        if(num[l]==0){
                            flag= false;
                            break;
                        }
                    }
                }
            }

            // flag = true 참, false = 거짓
            if(flag) count=1;
            else count= 0;

            System.out.println("#"+j+" "+ count);
        }
    }
}
