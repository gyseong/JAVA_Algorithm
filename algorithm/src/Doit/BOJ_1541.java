package algorithm.src.Doit;

import java.io.*;
import java.util.*;

public class BOJ_1541 {
    public static int[][] dp;
    public static boolean[][] visited;
    public static int H, W, start, end;
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int[] fx = {2, 0, -2, 0};
    public static int[] fy = {0, 2, 0, -2};
    public static char direction;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        int startx = 0;
        int starty = 0;
        dp = new int[H + 1][W + 1];
        visited = new boolean[H + 1][W + 1];

        for (int i = 1; i <= H; i++) {
            String str = br.readLine();
            int result;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '#') {
                    result = 1;
                } else {
                    result = 0;
                }
                dp[i][j + 1] = result;
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                if (dp[i][j] == 1 &&Start(i,j)) {
                    for(int d=0;d<4;d++){
                        if(!isStraightDir(i,j,d)) continue;
                        StringBuilder methodSB = new StringBuilder();
                        dfs(i,j,d,methodSB);
                        sb.append(i).append(" ").append(j).append("\n");
                        sb.append(dirConvert(d)).append("\n");
                        sb.append(methodSB.toString());
                        break;
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }

    static boolean Start(int i, int j) {
        int count = 0;
        for (int d = 0; d < 4; d++) {
            int nowx = i + dx[d];
            int nowy = j + dy[d];
            if (nowx >= 1 && nowy >= 1 && nowx <= H && nowy <= W && dp[nowx][nowy] == 1) count++;
        }
        return count==1;
    }
    static void dfs(int i, int j, int d, StringBuilder sb){


        int nx = i + dx[d] * 2;
        int ny = j + dy[d] * 2;
        moveStraight(i, j, d);
        sb.append("A");

        if(nx==H && ny==W) System.out.println();
        int leftD = d - 1 >= 0 ? d - 1 : 3;
        if (isStraightDir(nx, ny, leftD)) {
            sb.append("L");
            dfs(nx,ny, leftD, sb);
            return;
        }
        int rightD = (d + 1) % 4;
        //오른쪽
        if (isStraightDir(nx,ny, rightD)) {
            sb.append("R");
            dfs(nx, ny, rightD,sb);
            return;
        }
        //직진
        if (isStraightDir(nx, ny, d)) {
            dfs(nx, ny, d,sb);
            return;
        }
    }
    static boolean isStraightDir(int i, int j, int d){
        int nx = i + dx[d] * 2;
        int ny = j + dy[d] * 2;

        return nx>=1&& ny>=1 && nx<=H && ny<=W &&dp[i+dx[d]][j+dy[d]]==1 &&dp[i+dx[d]*2][j+dy[d]*2]==1;
    }
    static String dirConvert(int d) {
        if (d == 0)
            return "^";
        else if (d == 1)
            return ">";
        else if (d == 2)
            return "v";
        else
            return "<";
    }
    static void moveStraight(int x, int y, int d){
        for(int i=0;i<3;i++){
            dp[x][y]=0;
            x = x+dx[d];
            y = y+dy[d];
        }
    }
}
