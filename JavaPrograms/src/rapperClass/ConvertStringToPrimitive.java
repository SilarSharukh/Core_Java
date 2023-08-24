package rapperClass;

public class ConvertStringToPrimitive {

	public static void main(String[] args) {
		String s1="123";
		int i=Integer.parseInt(s1);
		System.out.println(s1);//1234
		System.out.println(i);//1234
		
	/*	String s2="Sun";
		int i1=Integer.parseInt(s1);
		System.out.println(s2);// It will throw number format execption
		System.out.println(i1);//  */
	
		String s3="12332163546464";
		long i2=Long.parseLong(s3);
		System.out.println(s3);//12332163546464
		System.out.println(i2);//12332163546464
	
		
		String s4="123.23";
		double i3=Double.parseDouble(s4);
		System.out.println(s4);//123.23
		System.out.println(i3);//123.23
		
		String s5="true";
		boolean i4=Boolean.parseBoolean(s5);
		System.out.println(s5);//true
		System.out.println(i4);//true
		
		String s6="Hello";
		boolean i5=Boolean.parseBoolean(s5);
		System.out.println(s6);//Hello
		System.out.println(i5);//false
		
		String s7="65";
		char i6=(char)Integer.parseInt(s7);
		System.out.println(s7);//123.23
		System.out.println(i6);
		
		String s8="z";
		char i7=s8.charAt(0);
		System.out.println(s8);//z
		System.out.println(i7);//z
		
		String s9="true";
		char i8=s9.charAt(3);
		System.out.println(s9);//123.23
		System.out.println(i8);//
		
		
	}

}
