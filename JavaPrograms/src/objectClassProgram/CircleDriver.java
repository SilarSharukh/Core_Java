package objectClassProgram;

public class CircleDriver {
public static void main(String[] args) {
	Circle c1 =new Circle(25);
	System.out.println(c1);
	Circle c2=new Circle(25);
	System.out.println(c1.equals(c2));
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());
	System.out.println(c1.hashCode()==c2.hashCode());
}
}
