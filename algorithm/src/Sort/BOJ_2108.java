package algorithm.src.Sort;

import java.util.*;
import java.io.*;

public class BOJ_2108 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hash = new HashMap<>();

        int a = Integer.parseInt(br.readLine());

        double sum = 0;

        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(br.readLine());
            sum += (double) b;
            list.add(b);
        }
        Collections.sort(list);
        int max = Collections.max(list);
        int min = Collections.min(list);

        if (max < 0 && min < 0) {
            min = Math.abs(min);
        }

        else if (max > 0 && min > 0) {
            min = min * -1;
        }

        else {
            max = Math.abs(max);
            min = Math.abs(min);
        }

        double k = sum / a;
        int avg = (int) Math.round(k);
        int mid = list.get(a / 2);
        int mode = 0;
        int range = max+min;

        for(int num : list){
            hash.put(num, hash.getOrDefault(num,0)+1);
        }

        int number= 0;
        for(int key: hash.values()){
            number = Math.max(number, key);
        }

        list.clear();
        for(int i : hash.keySet()){
            if(hash.get(i)==number){
                list.add(i);
            }
        }
        if(list.size()>=2){
            mode = list.get(1);
        }else{
            mode = list.get(0);
        }

        System.out.println(avg);
        System.out.println(mid);
        System.out.println(mode);
        System.out.println(range);
    }
}
