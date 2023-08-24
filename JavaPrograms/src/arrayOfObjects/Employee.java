package arrayOfObjects;

public class Employee {
	String name;
	int id;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	/*@Override
	public String toString()
	{
		return "Employee name="+name+"\n"+"Employee Id="+id;
	}
	@Override
	public boolean equals(Object o)
	{
		Employee temp=(Employee)o;
		if(this.id==temp.id)
			return true;
		else
			return false;
	}*/                        //it will not work
	

}
