package interfacePrograms;

public interface I2 extends I1 {
public static void main(String[] args) {
	m3();
	System.out.println(a);
}
static void m3()
{
	System.out.println("m3()");
}
int a =30;
 /*void m1()      we can inherit abstract methods from I1
 {
	 System.out.println("hi");
 }*/

// I2();  we cannot create a constructor in interface
}
