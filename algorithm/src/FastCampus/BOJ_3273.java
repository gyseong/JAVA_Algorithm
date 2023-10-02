package algorithm.src.FastCampus;
import java.io.*;
import java.util.*;
public class BOJ_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr= new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        sort(arr, x, 0, n-1);

    }
    public static void sort(int[] arr, int x, int start, int end){
        int count=0;

        while(start<end){
            if(arr[start]+arr[end]==x){
                count++;
                start++;
                end--;
            }else if(arr[start]+arr[end]<x){
                start++;
            }else{
                end--;
            }
        }
        System.out.println(count);
    }
}
