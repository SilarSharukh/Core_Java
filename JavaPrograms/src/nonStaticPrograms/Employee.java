package nonStaticPrograms;

public class Employee {
	
	
	// non static variables
String name;
int id;
double sal;
// single line non static initializer
String companyName="ABC";
// Multi line non static initializer
{
	System.out.println("Company Name "+companyName);
	}
//
public Employee()
{
	System.out.println("No argument constructor");
}
public Employee(String name, int id, double d)
{
	this.name=name;// non static variable=local variable
	this.id=id;
	this.sal=d;
}
/*
public void setProperty(String name, int id)
{
	this.name=name;// non static variable=local variable
	this.id=id;
}*/
	public void dispaly()
	{
		System.out.println("Employee name is "+name);
		System.out.println("Employee ID is "+id);
		System.out.println("Employee Salary is "+sal);
	}
}