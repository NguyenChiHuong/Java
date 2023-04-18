package queue_deque;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		Queue<String> queue1 = new LinkedList<String>();
		
		//queue1.add("")
		queue1.offer("huong1");
		queue1.offer("huong2");
		queue1.offer("ace");
		
		while(true) {
			//String ten = queue1.peek();
			String ten = queue1.poll();
			String ten1 = queue1.remove();
			String ten2 = queue1.element();
			if(ten == null) {
				break;
			}
			System.out.println(ten);
			System.out.println(ten1);
			System.out.println(ten2);
		}
	}
}
