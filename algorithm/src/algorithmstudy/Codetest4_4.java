package algorithmstudy;

import java.util.*;
import java.io.*;

public class Codetest4_4 {
	public static int n,m, x,y,direction;
	public static int[][] d = new int[50][50];
	
	public static int turnleft(int range) {
		range -=1;
		if(range==-1)
			range =3;
		return range;
	}
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int[][] arr = new int[a][b];
		int count = 1;
		int turn_time=0;
		
		String str1 = br.readLine();

		StringTokenizer st1 = new StringTokenizer(str1, " ");

		int row = Integer.parseInt(st1.nextToken());
		int column = Integer.parseInt(st1.nextToken());
		int range = Integer.parseInt(st1.nextToken()); // 현재 위치 row, column 구함

		int[] dx = { 0, 1, 0, -1 };
		int[] dy = { 1, 0, -1, 0 };

		d[row][column]=1;
		for (int i = 0; i < a; i++) {
			String str2 = br.readLine();
			StringTokenizer st2 = new StringTokenizer(str2);
			for (int j = 0; j < b; j++) {
				arr[i][j] = Integer.parseInt(st2.nextToken());
			}
		}
		
		while(true) {
			turnleft(range);
			int nx = row = +dx[range];
			int ny = column + dy[range];
			
			if(d[nx][ny]==0&&arr[nx][ny]==0) {
				d[nx][ny]=1;
				row  = nx;
				column = ny;
				count+=1;
				turn_time=0;
				continue;
			}
			else
				turn_time+=1;
			if(turn_time==4) {
				nx = row-dx[range];
				ny = column - dy[range];
				if(arr[nx][ny]==0) {
					row = nx;
					column = ny;
				}
				else 
					break;
				turn_time=0;
			}
		}
		System.out.println(count);
	}
}
