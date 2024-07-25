package algorithm.src.Implement;

import java.util.*;
import java.io.*;

public class BOJ_20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 전체 단어 수
        int n  = Integer.parseInt(st.nextToken());
        // 외울 단어의 길이
        int m  = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hash = new HashMap<>();

        for(int i=0;i<n;i++){
            String str = br.readLine();

            // 길이가 m 이상인 것만 hash에 넣어준다.
            if(str.length()>=m) {
                // 만약 들어있다면 카운트를 +1해서 다시 hash에 넣어줌
                hash.put(str, hash.getOrDefault(str,0)+1);
            }
        }
        // 맵의 키들을 리스트로 변환
        ArrayList<String> list = new ArrayList<>(hash.keySet());

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(Integer.compare(hash.get(o1), hash.get(o2))!=0){
                    return Integer.compare(hash.get(o2),hash.get(o1));
                }
                if(o1.length() !=o2.length()){
                    return o2.length()-o1.length();
                }
                return o1.compareTo(o2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for(String s : list){
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
