package algorithmstudy;
import java.util.*;

public class Codetest5_1 {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.pop();
		s.push(4);
		s.push(1);
		s.pop();
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		System.out.println();
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(1);
		q.offer(2);
		q.poll();
		q.offer(3);
		q.poll();
		q.offer(5);
		q.offer(4);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		
		Scanner n = new Scanner(System.in);
		int a = n.nextInt();
		
	}
}
