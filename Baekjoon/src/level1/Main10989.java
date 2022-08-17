package level1;

/*
 * CodeTest
 * Date : 2022/08/15
 * name : JJogyeongS
 * 
 */
import java.util.*;
import java.io.*;

public class Main10989 {
	public static void main(String[] args) throws IOException {

		int[] cnt = new int[10001];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			cnt[Integer.parseInt(br.readLine())]++;
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < 10001; i++){
            while(cnt[i] > 0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
	}
}
