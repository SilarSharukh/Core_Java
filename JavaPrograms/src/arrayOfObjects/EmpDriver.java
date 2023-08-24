package arrayOfObjects;

public class EmpDriver {

	public static void main(String[] args) {
		Employee e1=new Employee("Amit",101);
		Employee e2=new Employee("Aditya",102);
		Employee e3=new Employee("Amisha",103);
		
		
		System.out.println(e1);//arrayOfObjects.Employee@e580929
		System.out.println(e2);//arrayOfObjects.Employee@1d251891
		System.out.println(e3);//arrayOfObjects.Employee@48140564
		
		Employee e[]=new Employee[3];
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		
		System.out.println(e[0]);//arrayOfObjects.Employee@e580929
		
		for (int i=0;i<e.length;i++)
		{
			System.out.println("Employee name: "+e[i].name);
			System.out.println("Employee ID: "+e[i].id);/*  Employee name: Amit
															Employee ID: 101
															Employee name: Aditya
															Employee ID: 102
															Employee name: Amisha
															Employee ID: 103   */
		}
	}

}
