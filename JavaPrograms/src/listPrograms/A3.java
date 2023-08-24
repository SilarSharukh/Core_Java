package listPrograms;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class A3 {

	public static void main(String[] args) {
		LinkedList obj=new LinkedList();// it is non generic
		System.out.println(obj.isEmpty());
		obj.add(10);
		obj.add('i');
		obj.add(235.5);
		obj.add(96.0f);
		obj.add(1354644564l);
		obj.add("Hello");
		System.out.println(obj.size());
		System.out.println(obj);// because toString() of object is overridden
		obj.add(10);
		obj.add('i');
		System.out.println(obj);
		System.out.println(obj.lastIndexOf(10));
		obj.add(4, "Challo");
		System.out.println(obj);
		System.out.println(obj.size());
		
		
		System.out.println("*******************");
		LinkedList<Integer> obj1=new LinkedList<>();// interget 
		System.out.println(obj1.isEmpty());
		obj1.add(10);
		obj1.add(25);
		obj1.add(235);
		obj1.add(96);
		obj1.add(1);
		obj1.add(25);
		System.out.println(obj1.isEmpty());
		System.out.println(obj1.size());
		System.out.println(obj1);
		
		// contains if searching
		
		System.out.println(obj1.contains(5));
		System.out.println(obj1.contains("Hi"));
		
		// indixOf
		System.out.println(obj1.indexOf(10));
		System.out.println(obj1.lastIndexOf(25));
		System.out.println();
		
		// accessing the ArrayList
		// for for non genaric
		System.out.println("Element in obj");
		for (Object o:obj)
		{
			System.out.println(o);
		}
		// for generic
		System.out.println("Elements of obj1:");
		for (Integer i:obj1)
		{
			System.out.println(i);
		}
		System.out.println("Element printing with the Help of iterator");
		Iterator<Integer> i=obj1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("Element printing with the help of Listiterator in forward direction");
		ListIterator li=obj.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("Element printing with the help of Listiterator in forward direction");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		obj1.clear();
		System.out.println(obj1);
		System.out.println(obj1.size());
		System.out.println(obj1.isEmpty());
		
		

	}

}
