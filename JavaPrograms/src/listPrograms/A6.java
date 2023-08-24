package listPrograms;
import java.util.Vector;
public class A6 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.addElement("Hello");
		v1.addElement(true);
		v1.addElement(256.35);
		v1.addElement(12.0f);
		v1.addElement(125);
		v1.addElement(541648745313l);
		v1.addElement('&');
		System.out.println(v1.isEmpty());
		System.out.println(v1.size());
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		System.out.println(v1.elementAt(2));
		v1.removeElementAt(1);
		System.out.println(v1);
		v1.removeElement(125);
		System.out.println(v1);
		v1.removeAllElements();
		System.out.println(v1);
		System.out.println(v1.capacity());
		
		
	}

}
