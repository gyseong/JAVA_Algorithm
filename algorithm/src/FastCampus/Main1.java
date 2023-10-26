package algorithm.src.FastCampus;
import java.io.*;
import java.util.*;
public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        for(int i=0;i<n;i++) {
            if (arr[i] % 2 == 0) {
                list.add(arr[i]);
            } else {
                list1.add(arr[i]);
            }
        }
        Collections.reverse(list);
        Collections.reverse(list1);

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<list.size();i++){
            sb.append(list.get(i)+" ");
        }
        for(int i=0;i<list1.size();i++){
            sb.append(list1.get(i)+" ");
        }

        System.out.println(sb);
    }
}
