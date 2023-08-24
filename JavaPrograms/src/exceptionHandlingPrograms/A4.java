package exceptionHandlingPrograms;

public class A4 {
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
		try {
			d[3]=25;
		}
		
	
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		
		}
}
