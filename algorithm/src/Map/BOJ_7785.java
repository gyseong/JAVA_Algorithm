package algorithm.src.Map;

import java.util.*;
import java.io.*;

public class BOJ_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(br.readLine());
        // string으로 이루어진 treeset 생성 -> treeset은 데이터의 순서 보장, 중복 x, 오름차순 정렬까지
        TreeSet<String> set = new TreeSet<>(Collections.reverseOrder());

        for(int i=0;i<a;i++){
            // 키워드 입력
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 문자열 분리
            String str = st.nextToken();
            String str1 = st.nextToken();
            
            if(str1.equals("enter")){
                set.add(str);
            }else{
                set.remove(str);
            }
        }
        for(String s : set){
            System.out.println(s);
        }
    }
}
