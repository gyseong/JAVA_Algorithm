package algorithm.src.SWEA;
import java.util.*;
import java.io.*;
public class SWEA_2001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int j=0;j<t;j++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 숫자 입력
            int n = Integer.parseInt(st.nextToken());
            int m  = Integer.parseInt(st.nextToken());

            int [][] arr = new int[n][n];
            int [][] dp = new int[n][n];

            // 배열 입력
            for(int i=0;i<n;i++){
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                for(int k=0;k<n;k++){
                    arr[i][k] = Integer.parseInt(st1.nextToken());
                }
            }

            // 4중 for문으로 푸는 법
            int max = 0;
            for(int i=0;i<=n-m;i++){
                for(int k=0;k<=n-m;k++){
                    int sum = 0;
                    for(int l =0;l<m;l++){
                        for(int h=0;h<m;h++){
                            sum += arr[i+l][k+h];
                        }
                    }
                    max = Math.max(max, sum);
                }
            }
            System.out.println("#"+(j+1)+" "+ max);
        }
    }
}
