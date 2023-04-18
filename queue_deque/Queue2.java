package queue_deque;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue2 {

	public static void main(String[] args) {
		Queue<String> queue2 = new PriorityQueue<String>();
		
		//queue1.add("")
		queue2.offer("huong2");
		queue2.offer("huong1");
		queue2.offer("ace");
		
		while(true) {
			String ten = queue2.peek();
			//String ten = queue2.poll();
			//String ten1 = queue2.remove();
			//String ten2 = queue2.element();
			if(ten == null) {
				break;
			}
			System.out.println(ten);
			//System.out.println(ten1);
			//System.out.println(ten2);
		}
	}

}
