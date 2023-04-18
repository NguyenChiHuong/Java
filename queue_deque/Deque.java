package queue_deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class Deque {

	public static void main(String[] args) {
		java.util.Deque<String> deque = new ArrayDeque<String>();
		
		//queue1.add("")
		deque.offer("huong2");
		deque.offer("huong1");
		deque.offer("ace");
		deque.offerFirst("so1");
		deque.offerLast("so3");
		while(true) {
			//String ten = deque.peek();
			String ten = deque.poll();
			//String ten1 = deque.remove();
			String ten2 = deque.element();
			if(ten == null) {
				break;
			}
			System.out.println(ten);
			//System.out.println(ten1);
			System.out.println(ten2);
		}
	}
}
