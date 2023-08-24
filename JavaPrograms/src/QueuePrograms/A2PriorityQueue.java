package QueuePrograms;
import java.util.Collections;
import java.util.PriorityQueue;
public class A2PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue p1=new PriorityQueue();
		p1.offer(25);
		p1.offer(5);
		p1.offer(2);
		p1.offer(215);
		p1.offer(251);
		p1.offer(255);
		System.out.println(p1);
		System.out.println(p1.size());
		System.out.println(p1.contains("hi"));
		while (!(p1.isEmpty()))
		{
			System.out.println(p1.poll());
		}
		
		PriorityQueue p2=new PriorityQueue(Collections.reverseOrder());
		p2.offer(25);
		p2.offer(5);
		p2.offer(2);
		p2.offer(215);
		p2.offer(251);
		p2.offer(255);
		while (!(p2.isEmpty()))
		{
			System.out.println(p2.poll());
		}

	}

}
