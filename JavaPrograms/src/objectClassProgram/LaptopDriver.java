package objectClassProgram;

public class LaptopDriver {
public static void main(String[] args) {
	Laptop l1=new Laptop(4,256,"intel core i3");
	System.out.println(l1);
	Laptop l2=new Laptop(4,250,"intel i4");
	System.out.println(l2);
	System.out.println(l1.equals(l2));
	System.out.println(l1.hashCode());
	System.out.println(l2.hashCode());
	System.out.println(l1.hashCode()==l2.hashCode());
	
	
}
}
