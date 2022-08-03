package level1;

import java.util.*;

public class Main2839 {
	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		int a = n.nextInt();
		int count=0;
		
		if((a%5)==1||(a%5)==3) {
			count = (a/5)+1;
		}
		if((a%5)==2||(a%5)==4) {
			count = (a/5)+2;
		}
		if((a==4)||(a==7)) {
			count = -1;
		}
		else if (a%5==0) {
			count = (a/5);
		}
		
		System.out.println(count);
	}
}
