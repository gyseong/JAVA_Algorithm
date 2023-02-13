package algorithmstudy;

import java.util.*;
import java.io.*;

public class Codetest4_2 {
	public static boolean check(int i, int j, int k) {
		if(i%10==3||j/10==3||j%10==3||k/10==3||k%10==3) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner n = new Scanner(System.in);

		int a = n.nextInt();
		int count = 0;
		
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j < 6; j++) {
				for (int k = 0; k < 60; k++) {
					if(check(i,j,k))
						count++;
				}
			}
		}
		System.out.println(count);
	}
}
