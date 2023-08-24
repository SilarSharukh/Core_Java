package interfacePrograms;

public class Sample1 extends Sample{
	public void m1()
	{
		System.out.println("m1() from sample1 class");
	}
	public void m2()
	{
		System.out.println("m2() from sample1 class");
	}

	public static void main(String[] args) {
		Sample s1=new Sample1();
		s1.m1();
		s1.m2();
		s1.m4();
		
		I1 obj1= new Sample1();
		obj1.m1();
		obj1.m2();
		
		Sample s2=(Sample)obj1;
		s2.m4();
		
	
	}
}
