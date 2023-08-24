package understandingRefVariable;

public class AppleDriver {
public static void main(String[] args) {
	Apple a1=new Apple(10),a2,a3,a4;
	a2=a1;
	a3=a1;
	a4=a1;
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a4);
	System.out.println(a1.count);
	System.out.println(a2.count);
	System.out.println(a3.count);
	System.out.println(a4.count);
	//Carrot c1=a1; type mismatch

}
}
