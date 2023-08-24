package exceptionHandlingPrograms;
//try catch finally nested
public class A9 {
public static void main(String[] args) {
	int [] d=new int[3]; 
	int a=10,b=0,c;
	try {
		try {// inner try
			System.out.println("number divided by zero");
			c=a/b;
		}
		// catch block of inner try
		catch(ArithmeticException e1)
		{
			System.out.println("ArithmeticException Handeled");
		}
		finally {
			System.out.println("inner try 1 handeled");
			
		}
		try {// inner try 2
			d[0]=10;
			d[1]=20;
			d[2]=30;
			d[3]=10;
		}
		// catch for 2nd try
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		finally {
			System.out.println("inner try 2  handeled");
			
		}
	}
	catch(Exception e2)
	{
		System.out.println("Exception handled");
	}
	finally {
		System.out.println("All exception handeled");
		
	}
	
}
}
