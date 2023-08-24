package listPrograms;

import java.util.LinkedList;

public class A4 {

	public static void main(String[] args) {
		LinkedList a1=new LinkedList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a1);
		
		LinkedList a2=new LinkedList();
		a2.add(100);
		a2.add(200);
		a2.add(300);
		a2.add(400);
		a2.add(500);
		System.out.println(a2);
		System.out.println(a2.get(2));
		//set
		a2.set(0, 60);
		System.out.println(a2);
		// addall
		a1.addAll(a2);
		System.out.println(a1);
		System.out.println(a2);
		//cantainsAll
		System.out.println(a1.containsAll(a2));
		System.out.println(a2.containsAll(a1));
		//removeAll
		a1.removeAll(a2);
		System.out.println(a1);
		System.out.println(a2);
		
		LinkedList a4=new LinkedList();
		a4.add(10);
		a4.add(20);
		a4.add(30);
		a4.add(400);
		a4.add(500);
		System.out.println(a4);
		System.out.println("****");
		a1.retainAll(a4);
		System.out.println(a1);
		System.out.println("****");
		LinkedList<Integer> a3=new LinkedList<>();
		a3.add(100);
		a3.add(200);
		a3.add(300);
		a3.add(400);
		a3.add(500);
		System.out.println(a3);
		//create an array===> Integer
		Integer i[]=new Integer[a3.size()];
		i=a3.toArray(i);
		for(Integer ele:i)
		{
			System.out.println(ele);
		}
		

	}

}
