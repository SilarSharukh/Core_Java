package polymorphismPrograms;

public class BankDriver {
public static void main(String[] args) {
	SBI s1=new SBI();
	System.out.println(s1.getRateOfInterest());
	Bank s2=new SBI();
	System.out.println(s2.getRateOfInterest());
	Bank s3=new ICICI();
	System.out.println(s3.getRateOfInterest());
	Bank s4=new AXIS();
	System.out.println(s4.getRateOfInterest());

	
}
}
