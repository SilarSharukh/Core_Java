package SetProgram;
import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.TreeSet;
public class A2 {

	public static void main(String[] args) {
		HashSet<Integer> h1= new HashSet<>();

		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(102);
		h1.add(101);
		h1.add(25);
		h1.add(5);
		System.out.println(h1);
		// to sort the element of hash set we need it into arraylist or tree set
		ArrayList<Integer> a1=new ArrayList<>(h1); 
		System.out.println("Elemnets in ascending");
		Collections.sort(a1);
		System.out.println(a1);
		System.out.println("Elemnets in decending");
		Collections.sort(a1,Collections.reverseOrder());
		System.out.println(a1);
		
		// convert i t in treeset
		
		
		TreeSet t1=new TreeSet(h1);
		System.out.println(t1);
		
		TreeSet t2=new TreeSet(Collections.reverseOrder());
		t2.addAll(t1);
		System.out.println(t2);
		

	}

}
