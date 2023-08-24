package rapperClass;

public class UnBoxingProgram {

	public static void main(String[] args) {
		Integer j=10;
		int i=j.intValue();
		System.out.println(i+" is Prmitive value");
		System.out.println(j+" is Object value");
		
		
		Double d1=20.23;
		double d=d1.doubleValue();
		System.out.println(d+" is Prmitive value");
		System.out.println(d1+" is Object value");
		
		
		Boolean b1=true;
		boolean b=b1.booleanValue();
		System.out.println(b+" is Prmitive value");
		System.out.println(b1+" is Object value"); 

		Character c1='%';
		char c=c1.charValue();
		System.out.println(c+" is Prmitive value");
		System.out.println(c1+" is Object value");
	}

}
