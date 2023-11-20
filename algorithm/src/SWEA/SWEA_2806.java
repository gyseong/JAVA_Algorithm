package algorithm.src.SWEA;

import java.util.*;
import java.io.*;

public class SWEA_2806 {
    static int n, ans;
    static int[] col;
    // col[i]에 놓여있다는 기록
    // row 번 ~ n번 행에 대해서 가능한 퀸을 놓는 경우의 수 구하기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int test = 1; test <= t; test++) {
            n = Integer.parseInt(br.readLine());

            col = new int[n+1];
            ans  = 0;
            rec_func(1);

            System.out.print("#"+test+" "+ ans);
        }
    }
    static void rec_func(int row){
        if(row==n+1){
            ans++;
        }else{
            for(int cand = 1;cand<=n;cand++) {
                boolean possible = true;
                // 퀸을 놓을 수 있는지 체크
                for (int i = 1; i < row - 1; i++) {
                    if (attack(row, cand, i, col[i])) {
                        possible = false;
                        break;
                    }
                }
                if (possible) {
                    col[row] = cand;
                    rec_func(row + 1);
                    col[row] = 0;
                }
            }
        }
    }
    static boolean valid(){
        // 모든 퀸이 서로 공격 x => true
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                if(attack(i, col[i], j, col[j])) return false;
            }
        }
        return true;
    }
    static boolean attack(int r1, int c1, int r2, int c2){
        if(c1==c2) return true;
        // 행 - 열이 같으면 대각선에 공격할 수 있는 퀸이 있는 것
        if(r1-c1 == r2-c2) return true;
        // 행 + 열이 같으면 대각선에 공격할 수 있는 퀸이 있는것
        if(r1+c1  == r2+c2) return true;
        return false;
    }
}
