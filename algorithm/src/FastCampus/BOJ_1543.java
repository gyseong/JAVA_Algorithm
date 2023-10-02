package algorithm.src.FastCampus;

        import java.io.*;
        import java.util.*;

public class BOJ_1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String str1 = br.readLine();
/*
        int count=0;
        int startindex = 0;

        while(true){
            int findIndex = str.indexOf(str1,startindex);
            if(findIndex<0)break;
            count++;
            startindex = findIndex+str1.length();
        }
        System.out.println(count);
        */
        String replace = str.replace(str1,"");
        int length = str.length()-replace.length();
        int count = length/str1.length();

        System.out.println(count);
    }
}
