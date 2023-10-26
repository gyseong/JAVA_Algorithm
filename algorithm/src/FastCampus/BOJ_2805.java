package algorithm.src.FastCampus;
import java.io.*;
import java.util.*;

public class BOJ_2805 {
    static int[] arr;
    static int n,m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        arr = new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        //자료형에 헷갈리지 말자
        long l = 0, r =2000000000, ans = 0;

        while(l<=r){
            long mid = (l+r)/2;

            if(determin((int)mid)){
                ans = mid;
                l = mid+1;
            }else{
                r= mid-1;

            }
        }
        System.out.println(ans);
    }
    static boolean determin(int H){
        // H 높이로 나무들을 잘랐을 때, M만큼을 얻을 수 있다면 true, 아니면 false를 return 하는 함수
        long sum =0;
        for(int i=1;i<=n;i++){
            if(arr[i]>H){
                sum+=arr[i] - H;
            }
        }
        return sum>=m;
    }

}
