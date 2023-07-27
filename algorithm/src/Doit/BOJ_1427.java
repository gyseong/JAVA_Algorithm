package algorithm.src.Doit;
import java.io.*;
import java.util.*;
public class BOJ_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] arr = new int[10];

        for(int i=0;i<str.length();i++){
            arr[i] = str.charAt(i)-'0';
        }
        for(int i=0;i<str.length();i++){
            int max = i;
            for(int j=i+1;j<str.length();j++){
                if(arr[max]<arr[j]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;

            System.out.print(arr[i]);
        }
    }
}
