package encapsulationPrograms;

public class SimDriver {
	public static void main(String[] args) {
		Sim s1=new Sim("Airtel",98654785000l,299,"Red");
		System.out.println(s1.getServiceProvider());
		System.out.println(s1.getSimNo());
		System.out.println(s1.getBalance());
		System.out.println(s1.getColor());
		s1.setServiceProvider("Jio");
		s1.setBalance(189);
		s1.simDetails();
		System.out.println("**********************************************");
		Sim s2=new Sim("Idea");
		s2.simDetails();
		System.out.println("**********************************************");
		Sim s3=new Sim(9988776655l);
		s3.simDetails();
		System.out.println("**********************************************");
		Sim s4=new Sim(299);
		s4.simDetails();
		System.out.println("**********************************************");
		Sim s5=new Sim("Hurch",9966332211l);
		s5.simDetails();
		System.out.println("**********************************************");
		Sim s6=new Sim("Hurch",996);
		s6.simDetails();
		System.out.println("**********************************************");
		Sim s7=new Sim("Hurch","Red");
		s7.simDetails();
		System.out.println("**********************************************");
		Sim s8=new Sim(9966332211l,"Idea");
		s8.simDetails();
		System.out.println("**********************************************");
		Sim s9=new Sim(9966332211l,298);
		s9.simDetails();
		System.out.println("**********************************************");
		Sim s10=new Sim(229,"Airtel");
		s10.simDetails();
		System.out.println("**********************************************");
		
		System.out.println("**********************************************");
		Sim s11=new Sim("Hurch",9966332211l,229);
		s11.simDetails();
		System.out.println("**********************************************");
		Sim s12=new Sim("Hurch",9966332211l,"Red");
		s12.simDetails();
		System.out.println("**********************************************");
		Sim s13=new Sim("Hurch",298,"Red");
		s13.simDetails();
		System.out.println("**********************************************");
		Sim s14=new Sim("Hurch","Red",9966332211l);
		s14.simDetails();
		System.out.println("**********************************************");
		Sim s15=new Sim("Hurch","Red",996);
		s15.simDetails();
		System.out.println("**********************************************");
		Sim s16=new Sim(9966332211l,259,"Red");
		s16.simDetails();
		System.out.println("**********************************************");
		Sim s17=new Sim(9966332211l,"Red",298);
		s17.simDetails();
		System.out.println("**********************************************");
		Sim s18=new Sim(9966332211l,"Airtel","Red");
		s18.simDetails();
		System.out.println("**********************************************");
		Sim s19=new Sim();
		s19.setServiceProvider("Google");
		s19.setBalance(299);
		s19.setSimNo(9922447788l);
		System.out.println(s19.getBalance());
		System.out.println(s19.getServiceProvider());
		System.out.println(s19.getSimNo());
	
		
	
	}
	
	

	
}
