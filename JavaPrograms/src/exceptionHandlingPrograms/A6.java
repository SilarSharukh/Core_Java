package exceptionHandlingPrograms;
//finally with out exception
public class A6 {
public static void main(String[] args) {
	int [] d=new int[3]; 
	try {
		d[0]=10;
		d[1]=20;
		d[2]=30;
		
	}
	catch(ArrayIndexOutOfBoundsException i)
	{
		System.out.println("ArrayIndexOutOfBoundsException handled");
	}
	finally {
		System.out.println("Finally block executed");
		
	}
}
}
