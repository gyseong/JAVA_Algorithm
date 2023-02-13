package algorithmstudy;

import java.util.*;

public class Baekjoon1932 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("삼각형의 크기를 입력하세요..(단,크기는 1~500)");
		int num = n.nextInt();
		ArrayList<Integer> Array = new ArrayList<Integer>(); //동적 할당 배열
		int[] numarray = new int[num]; //값 저장 배열
		System.out.println(num);
		int i=1;
		while(i<=num) {
			System.out.println(i+"개의 수를 입력");
			for(int j=0;j<i;j++) {
				int num1 = n.nextInt();
				Array.add(num1);
				int num2 = Array.indexOf(i);
				if(num2 == (num-i)) {
					int num3 = Collections.max(Array);
					System.out.println(num3);
				}
			}
			i++;
		}
		System.out.println(Array);
	}

}
