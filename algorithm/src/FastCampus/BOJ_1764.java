package algorithm.src.FastCampus;
import java.io.*;
import java.util.*;


public class BOJ_1764 {
    static String[] str, str1;
    static int count=0, n,m;
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n  = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        str = new String[n];
        str1 = new String[m];

        for(int i=0;i<n;i++){
            str[i] = br.readLine();
        }
        for(int i=0;i<m;i++){
            str1[i] = br.readLine();
        }
        Arrays.sort(str1);

        search();
    }

    public static void search(){
        for(int i=0;i<n;i++){
            if(low_bound(str[i]))list.add(str[i]);
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static boolean low_bound(String st){
        int start = 0;
        int end = m-1;

        int result = 0;
        while(start<=end){
            int mid = (start+end)/2;

            if(str1[mid].compareTo(st)==0){
                return true;
            }else if(str1[mid].compareTo(st)<0){
                start = mid+1;
            }else if(str1[mid].compareTo(st)>0){
                 end = mid-1;
            }
        }
        return false;
    }
}
