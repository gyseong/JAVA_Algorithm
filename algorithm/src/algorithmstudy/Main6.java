package algorithmstudy;

import java.util.*;
//왕실의 나이트
public class Main6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] dx = { 2, 2, -2, -2, 1, -1, 1, -1 };
		int[] dy = { 1, -1, 1, -1, 2, -2, -2, 2 };
		
		String str = sc.nextLine();
		int count=0;
		int row  = str.charAt(1)-'0';
		int column = str.charAt(0)-'a'+1;
		
		for(int i=0;i<8;i++) {
			int row1 = row + dx[i];
			int column1 = column+dy[i];
			if(row1<=8 && column1 <=8 && row1>=1 && column1>=1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
