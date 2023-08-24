package interfacePrograms;

public class A2 extends A1 implements I1 {
	public void m1()
	{
		System.out.println("m1() from A2 class");
	}
	public void m2()
	{
		System.out.println("m2() from A2 class");
	}
	public static void main(String[] args) {
		A2 a2=new A2();
		a2.m1();
		a2.m2();
		
		A1 a1=new A2();
		a1.m1();
		a1.m2();
		
		I1 i1=new A2();
		i1.m1();
		i1.m2();
	}
}
