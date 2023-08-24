package exceptionHandlingPrograms;
//throws with unchecked exception.
public class A11 {

	public static void main(String[] args) {
	
		try{
			check();
		}
		catch(NullPointerException n)
		{
			System.out.println("NullPointerException Handled");
		}
		
	}
		
		public static void check() throws NullPointerException
		{
			String s=null;
			if(s.equals("Shai"))
				System.out.println("Same");
			else
				System.out.println("Not Same");
		}
		

	

}
