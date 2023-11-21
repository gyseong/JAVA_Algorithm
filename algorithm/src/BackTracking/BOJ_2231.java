package algorithm.src.BackTracking;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class BOJ_2231 {
    static int m, target, min = Integer.MAX_VALUE, sum;
    static int[] selected;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        target = Integer.parseInt(br.readLine());

        String str = Integer.toString(target);
        m = str.length();

        selected = new int[m + 1];

        rec_func(1);
        Collections.sort(list);
        if (list.size() == 0) {
            System.out.println(0);
        } else {
            System.out.println(list.get(0));
        }
    }

    static void rec_func(int k) {
        if (k == m + 1) {
            String str = "";
            sum = 0;
            for (int i = 1; i < m + 1; i++) {
                sum += selected[i];
                str += Integer.toString(selected[i]);
            }
            sum += Integer.parseInt(str);

            if (sum == target) {
                min = Math.min(min, sum);
                list.add(Integer.parseInt(str));
            }

        } else {
            for (int i = 0; i <= 9; i++) {
                selected[k] = i;
                rec_func(k + 1);
                selected[k] = 0;
            }
        }
    }
}
