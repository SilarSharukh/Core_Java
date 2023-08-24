package exceptionHandlingPrograms;

public class A2 {

static void div()
{
	int a=10,b=0,c;
	try {
		c=a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e)
	{
		System.out.println("ArithmeticException handled");
	}
}
	public static void main(String[] args) {
		div();
	}

}
