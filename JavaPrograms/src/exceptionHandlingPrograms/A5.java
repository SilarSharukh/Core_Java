package exceptionHandlingPrograms;
// single try with multiple catch block
public class A5 {
	public static void main(String[] args) {
		int a=10,b=0,c;
		int d[]=new int[3];
		try {
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException handled");
		}
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(Exception g)
		{
			System.out.println("Exception handled");
		}
		
		}

}
