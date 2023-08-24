package QueuePrograms;
import java.util.LinkedList;
public class A1LinkedListQueue {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.offer(4);
		l1.offer("hello");
		l1.offer('4');
		l1.offer(true);
		l1.offer(25.2f);
		l1.offer(2589.25);
		l1.offer(6466564664684l);
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1.poll());
		System.out.println(l1);
		
		LinkedList<String> l2=new LinkedList<>();
		l2.offer("Manjeet");
		l2.offer("hello");
		l2.offer("Aman");
		l2.offer("Cat");
		l2.offer("Batman");
		l2.offer("Surya");
		l2.offer("man");
		System.out.println(l2);
		System.out.println(l2.peek());
		System.out.println(l2.poll());
		System.out.println(l2);
		
	    //l2.toArray();
		for(String ele:l2)
		{
			System.out.println(ele);
		}
		l2.addAll(l1);
		System.out.println(l2);
		System.out.println(l2.containsAll(l2));
		System.out.println(l2.contains("Man"));
		System.out.println(l2.equals(l1));
		System.out.println(l2.getFirst());
		 
		System.out.println(l2.getClass());
		System.out.println(l2); 
		
		

	}

}
