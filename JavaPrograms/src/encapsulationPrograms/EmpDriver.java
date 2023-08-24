package encapsulationPrograms;

public class EmpDriver {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.display();
		System.out.println("*******************************");
		Employee e2=new Employee("John");
		e2.display();
		System.out.println("*******************************");
		Employee e3=new Employee(20121);
		e3.display();
		System.out.println("*******************************");
		Employee e4=new Employee(9966332211l);
		e4.display();
		System.out.println("*******************************");
		Employee e5=new Employee("Cena","O+");
		e5.display();
		System.out.println("*******************************");
		Employee e6=new Employee("Ramesh",12321);
		e6.display();
		System.out.println("*******************************");
		Employee e7=new Employee("Suresh",9966554477l);
		e7.display();
		System.out.println("*******************************");
		Employee e8=new Employee(12121,5000);
		e8.display();
		System.out.println("*******************************");
		Employee e9=new Employee(1212,"Mallesh");
		e9.display();
		System.out.println("*******************************");
		Employee e10=new Employee(12121,9966332211l);
		e10.display();
		System.out.println("*******************************");
		Employee e11=new Employee(9988774411l,23155);
		e11.display();
		System.out.println("*******************************");
		Employee e12=new Employee(9988774455l,"Arjun");
		e12.display();
		System.out.println("*******************************");
		Employee e13=new Employee("Ramana","AB-",001);
		e13.display();
		System.out.println("*******************************");
		Employee e14=new Employee("Suman","o-",9966332211l);
		e14.display();
		System.out.println("*******************************");
		Employee e15=new Employee("Samar",007,"AB+");
		e15.display();
		System.out.println("*******************************");
		Employee e16=new Employee("Saleem",9988774455l,"B+");
		e16.display();
		System.out.println("*******************************");
		Employee e17=new Employee("Sudar",9966335544l,1232);
		e17.display();
		System.out.println("*******************************");
		Employee e18=new Employee("Ram",1258,9966887744L);
		e18.display();
		System.out.println("*******************************");
		Employee e19=new Employee("Krishna",1254,50000);
		e19.display();
		System.out.println("*******************************");
		Employee e20=new Employee(1254,9988556644l,"Murthy");
		e20.display();
		System.out.println("*******************************");
		Employee e21=new Employee("Murthy","O+",999,9988774455L);
		e21.display();
		System.out.println("*******************************");
		Employee e22=new Employee("Megha","O+",999,9988);
		e22.display();
		System.out.println("*******************************");
		Employee e23=new Employee("Sudha","A+",007,8975642365l,30000);
		e23.display();
		System.out.println("*******************************");
	
	}

}