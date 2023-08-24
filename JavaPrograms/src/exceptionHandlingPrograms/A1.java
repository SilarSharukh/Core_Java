package exceptionHandlingPrograms;

public class A1 {

static void div()
{
	int a=100,b=0,c;
	c=a/b;//10/0-----> We will get java.lang.ArithmaticException
	// According to the syntax it is correct but according logic it is wrong  
	
	
	System.out.println(c);
}
public static void main(String[] args) {
	div();
}
}
