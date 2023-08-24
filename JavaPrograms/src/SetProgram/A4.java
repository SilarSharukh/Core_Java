package SetProgram;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class A4 {

	public static void main(String[] args) {
		LinkedHashSet h1= new LinkedHashSet();
		h1.add(10);
		h1.add("Hi");
		h1.add('7');
		h1.add(10.02f);
		h1.add(true);
		System.out.println(h1.isEmpty());
		System.out.println(h1.size());
		System.out.println(h1);
		h1.add(10);
		System.out.println(h1);
		
		// accessing hashset
		for(Object ele:h1)
		{
			System.out.println(ele);
		}
		
		LinkedHashSet<String> h2= new LinkedHashSet<>();
		h2.add("Hello");
		h2.add("bye");
		h2.add("an");
		h2.add("cat");
		h2.add("true");
		System.out.println(h2.isEmpty());
		System.out.println(h2.size());
		System.out.println(h2);
		h2.add("cat");
		System.out.println(h2);
		
		for(String ele:h2)
		{
			System.out.println(ele);
		}
		
		
		System.out.println(h1.contains('7'));
		System.out.println(h1.contains(22));
		
		LinkedHashSet h3= new LinkedHashSet();
		h3.add(10);
		h3.add(20);
		h3.add(30);
		h3.add(100);
		h3.add(50);
		System.out.println(h3);
		
		LinkedHashSet h4= new LinkedHashSet();

		h4.add(10);
		h4.add(20);
		h4.add(30);
		h4.add(102);
		h4.add(101);
		
		h3.addAll(h4);
		System.out.println(h3);
		
		System.out.println(h3.contains(h4));
		System.out.println(h4.contains(h3));
		
		h3.remove(20);
		System.out.println(h3);
		
		h3.removeAll(h4);
		System.out.println(h3);
		
		
		LinkedHashSet<Integer> h5= new LinkedHashSet<>();

		h5.add(10);
		h5.add(20);
		h5.add(30);
		h5.add(102);
		h5.add(101);
		
		// create an integer array
		
		Integer [] i=new Integer[h5.size()];
		i=h5.toArray(i);
		for(Integer ele:i)
		{
			System.out.println(ele);
		}
		

	}

}
