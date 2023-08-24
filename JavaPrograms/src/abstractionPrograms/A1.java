package abstractionPrograms;

abstract public class A1 {
	static int a=45;
	int b=60;
	
	public A1()
	{
		System.out.println("A1 class Constructor");
	}
	abstract public void m1();// incomplete member
	public void m2()
	{
		System.out.println("m2() from Abstract class");
	}
}
