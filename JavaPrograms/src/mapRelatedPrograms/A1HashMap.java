package mapRelatedPrograms;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
public class A1HashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> h1=new HashMap<>();
		h1.put(101, "Rahul");
		h1.put(102, "Ramesh");
		h1.put(103, "Ravi");
		h1.put(104, "Ramu");
		System.out.println(h1);
		System.out.println(h1.get(101));
		System.out.println(h1.containsKey(102));
		System.out.println(h1.containsValue("Ram"));
		System.out.println(h1.isEmpty());
		System.out.println(h1.replace(101, "Rajesh"));
		System.out.println(h1.size());
		System.out.println(h1);
		h1.replace(102, "Ramesh", "Ramesh.s");
		System.out.println(h1);
		System.out.println(h1.keySet());
		System.out.println(h1.entrySet());
		System.out.println(h1.values());
		Object a=h1.keySet().toArray();
		System.out.println(a);
		
		HashMap h2=new HashMap();
		h2.put(101, "Rahul");
		h2.put(true, '&');
		h2.put('a',35116546464l);
		h2.put(254.25f, 25666.255);
		System.out.println(h2.size());
		System.out.println(h2.isEmpty());
		System.out.println(h2);
		
		
		HashMap<Integer,String> h3=new HashMap<>();
		h3.put(101, "Rahul");
		h3.put(112, "Ramesh");
		h3.put(113, "Ravi");
		h3.put(114, "Ramu");
		//h1.putAll(h3);
		h3.putAll(h1);
		System.out.println(h3.size());
		System.out.println(h3.containsKey(112));
		System.out.println(h3.containsValue("Rahul"));
		System.out.println(h3.entrySet());
		
		System.out.println(h3.get(101));
		System.out.println(h3.remove(112));
		System.out.println(h3.remove(102, "Ramesh.s"));
		
		// set for keys
		
		Set s1=h3.keySet();
		System.out.println("The keys are");
		for(Object ele:s1)
		{
			System.out.println(ele);
		}
		
		// for values
		System.out.println("The values are:");
		Collection v1= h2.values();
		for(Object ele:v1)
		{
			System.out.println(ele);
		}
		
		// the key value pair
		
		System.out.println("The key and value pair are:");
		for(Map.Entry<Integer,String> i:h3.entrySet())
		{
			System.out.println(i);
		}
		
		/*HashMap h4=new HashMap<>(Collections.reverseOrder()));
		h4.put(102, "Ramesh");
		h4.put(13, "Ravi");
		h4.put(104, "Ramu");
		System.out.println(h4);*/
		
		
		
		
		
		
		
		
		
	}

}
