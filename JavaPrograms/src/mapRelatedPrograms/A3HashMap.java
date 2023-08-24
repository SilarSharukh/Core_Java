package mapRelatedPrograms;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class A3HashMap {
	public static void main(String[] args) {
		HashMap<Integer,String> t1=new HashMap<>();
		t1.put(101, "Raj");
		t1.put(01, "Raja");
		t1.put(10, "Raju");
		System.out.println(t1.size());
		System.out.println(t1);
		HashMap<Integer,String> t2=new HashMap<>();
		t2.put(101, "Raj");
		t2.put(011, "Raja");
		t2.put(102, "Raju");
		System.out.println(t2.size());
		System.out.println(t2);
		t1.putAll(t2);
		System.out.println(t1.size());
		System.out.println(t1.containsKey(102));
		System.out.println(t1.containsValue("raj"));
		System.out.println(t1.remove(101));
		System.out.println(t1);
		System.out.println(t1.replace(102, "Raju.s"));
		System.out.println("The keys of t1 are :");
		Set s1=t1.keySet();
		for(Object ele:s1)
		{
			System.out.println(ele);
		}
		System.out.println("The values of t1 are :");
		Collection c1=t1.values();
		for(Object ele:c1)
		{
			System.out.println(ele);
		}
		System.out.println("The keys and value pairs of t1 are :");
		
		for(Map.Entry<Integer, String> i:t1.entrySet())
		{
			System.out.println(i);
		}
		HashMap<Integer,String> t3=new HashMap<>();//(Collections.reverseOrder());
		t3.put(101, "Raj");
		t3.put(11, "Raja");
		t3.put(102, "Raju");
		
		TreeMap<Integer,String> tm1=new TreeMap<>(t3);
		System.out.println("The ascending order is:");
		System.out.println(tm1);
		
		TreeMap<Integer,String> tm2=new TreeMap<>(Collections.reverseOrder());
		tm2.putAll(tm1);
		System.out.println("The Descending order of t3:");
		System.out.println(t3);
		
		
	}

}
