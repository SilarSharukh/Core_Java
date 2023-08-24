package exceptionHandlingPrograms;

public class A10 {

	public static void main(String[] args) {
		String s1="123";
		String s2="Sun";
		String s3="12332163546464";
		String s4="123.23";
		String s5="true";
		String s6="Hello";
		String s7="65";
		String s8="a";
		String s9="true";
		try {
		int i=Integer.parseInt(s1);
		System.out.println(s1);//123
		System.out.println(i);//123
		
	
		/*int i1=Integer.parseInt(s2);
		System.out.println(s2);// It will throw number format execption
		System.out.println(i1);//  */
	
		
		long i2=Long.parseLong(s3);
		System.out.println(s3);//12332163546464
		System.out.println(i2);//12332163546464
	
		
		
		double i3=Double.parseDouble(s4);
		System.out.println(s4);//123.23
		System.out.println(i3);//123.23
		
		
		boolean i4=Boolean.parseBoolean(s5);
		System.out.println(s5);//true
		System.out.println(i4);//true
		
		
		boolean i5=Boolean.parseBoolean(s5);
		System.out.println(s6);//Hello
		System.out.println(i5);//false
		
		
		char i6=(char)Integer.parseInt(s7);
		System.out.println(s7);//123.23
		System.out.println(i6);
		
	
		char i7=s8.charAt(0);
		System.out.println(s8);//z
		System.out.println(i7);//z
		
		char i8=s9.charAt(3);
		System.out.println(s9);//123.23
		System.out.println(i8);//
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException handled");
		}
	}

}
