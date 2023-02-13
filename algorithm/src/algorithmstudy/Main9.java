package algorithmstudy;

import java.util.*;
import java.io.*;
//음료수 얼려먹기(dfs)
public class Main9 {
	public static int[][] graph = new int[1000][1000];
	public static int a,b;
	
	public static boolean dfs(int x,int y) {
		if (x <= -1 || x >=a || y <= -1 || y >= b) {
            return false;
        }
		if(graph[x][y]==0) {
			graph[x][y]=1;
			dfs(x-1,y);
			dfs(x+1,y);
			dfs(x,y-1);
			dfs(x,y+1);
			
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<a;i++) {
			String str = sc.nextLine();
			for(int j=0;j<b;j++) {
				graph[i][j] = str.charAt(j)-'0';
			}
		}
		int result=0;
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				if(dfs(i,j))
					result +=1;
			}
		}
		System.out.println(result);
	}
}
