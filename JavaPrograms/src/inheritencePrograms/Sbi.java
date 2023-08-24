package inheritencePrograms;

public class Sbi extends Bank{
String managerName;

public Sbi(String name, String branch, String ifscCode, String managerName) {
	super(name, branch, ifscCode);
	this.managerName = managerName;
}
public void display()
{
	 System.out.println("The Name of the Bank is "+this.name);
	 System.out.println("The Branch of the Bank is "+this.branch);
	 System.out.println("The IFSC Code of the Bank is "+this.ifscCode);
	 System.out.println("The Manager of the Bank is "+this.managerName);
}
}
