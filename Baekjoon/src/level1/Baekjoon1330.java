package level1;
import java.util.*;

public class Baekjoon1330 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		
		int num1 = n.nextInt();
		int num2 = n.nextInt();

		if(num1==num2)
			System.out.println("==");
		else if (num1>num2)
			System.out.println(">");
		else
			System.out.println("<");
			
	}

}
