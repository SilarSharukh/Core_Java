package listPrograms;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
public class A5 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(108);
	a1.add(10);
	a1.add(18);
	a1.add(8);
	a1.add(198);
	a1.add(128);
	System.out.println("Unsorted list: ");
	System.out.println(a1);
	// sorting array list in ascending order
	Collections.sort(a1);
	System.out.println("sorted list in ascending order: ");
	System.out.println(a1);
	Collections.sort(a1, Comparator.reverseOrder());
	System.out.println("sorted list in ascending order: ");
	System.out.println(a1);
	
	
	
	LinkedList a2=new LinkedList();
	a2.add("Rajesh");
	a2.add("Suresh");
	a2.add("Mahesh");
	a2.add("Manish");
	a2.add("Vijay");
	a2.add("Aman");
	System.out.println("Unsorted list: ");
	System.out.println(a2);
	// sorting array list in ascending order
	Collections.sort(a2);
	System.out.println("sorted list in ascending order: ");
	System.out.println(a2);
	Collections.sort(a2, Comparator.reverseOrder());
	System.out.println("sorted list in ascending order: ");
	System.out.println(a2);
	
}
}
