package SetProgram;
import java.util.TreeSet;
import java.util.Collections;
public class A3 {

	public static void main(String[] args) {
	TreeSet t1=new TreeSet();
	t1.add(12);
	t1.add(25);
	t1.add(5);
	t1.add(252);
	t1.add(-25);
	t1.add(-5);
	t1.add(0);
	t1.add(55);
	System.out.println(t1);
	
	TreeSet t2=new TreeSet(Collections.reverseOrder());
	t2.add(12);
	t2.add(25);
	t2.add(5);
	t2.add(252);
	t2.add(-25);
	t2.add(-5);
	t2.add(0);
	t2.add(55);
	
	System.out.println(t2);
	
	TreeSet t3=new TreeSet();
	t3.add("Hi");
	t3.add("Bye");
	System.out.println(t3);
	
	
	TreeSet t4=new TreeSet(Collections.reverseOrder());
	t4.add("Hi");
	t4.add("Bye");
	System.out.println(t4);

	}

}
