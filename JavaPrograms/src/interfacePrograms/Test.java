package interfacePrograms;

public class Test implements I1,I3{
	int a=10;
	
	
	public void m1()
	{
		System.out.println("m1() from Test class");
	}
	public void m2()
	{
		System.out.println("m2() from Test class");
	}
public static void main(String[] args) {
	Test t1=new Test();
	t1.m1();
	t1.m2();
	
	I1 i1= new Test();
	i1.m1();
	i1.m2();
	
	I3 i3=new Test();
	i3.m1();
	i3.m2();
}
}
