package nonStaticPrograms;

public class NonStaticContext {
// non static multi-line initializer
	{
		System.out.println("Multi line non static initializer");
	}
	//Multi line static initializer
	static
	{
		System.out.println("Multi line static initializer");
	}
	//Single line non static initializer
	int b=367;
	// Multi line static initializer
	static
	{
		NonStaticContext i= new NonStaticContext();
		System.out.println(i.b);
		
	}
	static int a=29;
	public static void main(String[] args)
	{
		NonStaticContext i1= new NonStaticContext();
		System.out.println(i1.a);
		System.out.println(NonStaticContext.a);
		i1.b=89;
		i1.a=49;
		System.out.println(i1.b+a);
	}
}
