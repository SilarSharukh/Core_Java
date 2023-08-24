package understandingRefVariable;

public class CarrotDriver1 {
public static void main(String[] args) {
	Carrot c1=new Carrot(10);
	Carrot c2=new Carrot(10);
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c1.count);
	System.out.println(c2.count);
	System.out.println(c1==c2);
}
}
