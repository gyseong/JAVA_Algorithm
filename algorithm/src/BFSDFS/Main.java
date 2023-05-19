package algorithm.src.BFSDFS;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> st = new Stack<Character>();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                st.push(str.charAt(i));
            } else {
                if (st.size() == 0) {
                    st.push(str.charAt(i));
                } else {
                    st.pop();
                }
            }
        }
        if (st.isEmpty()) {
            System.out.println("good");
        } else {
            if(st.contains(')')) {
                System.out.println("bad");
            }
            else{
                System.out.println(st.size());
            }
        }

    }
}
