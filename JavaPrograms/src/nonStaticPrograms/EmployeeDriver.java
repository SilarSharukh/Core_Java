package nonStaticPrograms;

public class EmployeeDriver {
public static void main(String[] args) {
	Employee e1=new Employee("Sunitha",564,5000);// 1. load non static member,2. execute NSI, 3. Executed PWI
	System.out.println(e1);
	e1.dispaly();
	System.out.println("*********************************");
	Employee e2=new Employee("Agent",007,150000);// 1. load non static member,2. execute NSI, 3. Executed PWI
	System.out.println(e2);
	e2.dispaly();
}
}
