package algorithmstudy;

import java.util.*;

public class Baekjoon1932 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("�ﰢ���� ũ�⸦ �Է��ϼ���..(��,ũ��� 1~500)");
		int num = n.nextInt();
		ArrayList<Integer> Array = new ArrayList<Integer>(); //���� �Ҵ� �迭
		int[] numarray = new int[num]; //�� ���� �迭
		System.out.println(num);
		int i=1;
		while(i<=num) {
			System.out.println(i+"���� ���� �Է�");
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
