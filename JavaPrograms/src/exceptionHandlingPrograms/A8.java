package exceptionHandlingPrograms;
//finally with exception and not handled handled
public class A8 {
	public static void main(String[] args) {
		int [] d=new int[3]; 
		try {
			d[0]=10;
			d[1]=20;
			d[2]=30;
			d[3]=10;
			
		}
		
		finally {
			System.out.println("Finally block executed");
			
		}
	}
}
