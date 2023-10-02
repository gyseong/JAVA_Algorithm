package algorithm.src.FastCampus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[45];

        for(int i=1;i<45;i++){
            arr[i] = i*(i+1)/2;
        }
        for(int i=0;i<n;i++){
            int a = Integer.parseInt(br.readLine());
            int result = check(arr, a);
            System.out.println(result);
        }
    }
    public static int check(int[] arr, int a){
        for(int i=1;i<45;i++){
            for(int j=1;j<45;j++){
                for(int k=1;k<45;k++){
                    if(arr[i]+arr[j]+arr[k]==a)
                        return 1;
                }
            }
        }
        return 0;
    }
}
