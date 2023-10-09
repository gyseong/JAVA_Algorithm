package algorithm.src.FastCampus;
import java.io.*;
import java.util.*;
public class BOJ_7795 {
    static int[] A, B;
    static int count= 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            A = new int[n+1];
            B = new int[m+1];

            StringTokenizer st1 = new StringTokenizer(br.readLine());

            for(int j=1;j<=n;j++){
                A[j] = Integer.parseInt(st1.nextToken());
            }
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j=1;j<=m;j++){
                B[j] = Integer.parseInt(st2.nextToken());
            }
            Arrays.sort(B);
            //print_arr(A, B);
            search();
        }
    }
    public static void print_arr(int[] a, int[] b){
        count = 0;
        for(int i=1; i<a.length;i++){
            for(int j=1;j<b.length;j++){
                if(a[i]>b[j]) {
                    count+=1;
                }
            }
        }
    }
    public static void search(){
        int count1=0;
        for(int i=1;i<A.length;i++){
            count1+=low_bound(A[i],B,1,B.length-1);
        }
        System.out.println(count1);
    }
    public static int low_bound(int a, int[] arr, int start, int end){
        int result = start-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]<a){
                result = mid;
                start = mid+1;
            }else if(arr[mid]>=a){
                end = mid-1;
            }
        }
        return result;
    }
}
