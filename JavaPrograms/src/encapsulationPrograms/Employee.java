package encapsulationPrograms;

public class Employee {
	private String empName;
	private String empBloodGroup;
	private int empId;
	private long empCNo;
	private int empSal;
	
	public String getEmpName()
	{
		return empName;
	}
	
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
	
	public String getEmpBloodGroup()
	{
		return empBloodGroup;
	}
	
	public int getEmpId()
	{
		return empId;
	}
	
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	
	public int getEmpSal()
	{
		return empSal;
	}
	
	public void setEmpSal(int empSal)
	{
		this.empSal=empSal;
	}
	
	public long getEmpCNo()
	{
		return empCNo;
	}
	
	public void setEmpCNo(long empCNo)
	{
		this.empCNo=empCNo;
	}
	
	Employee(){}
	
	Employee(String empName)
	{
		this.empName=empName;
	}
	
	Employee(int empId)
	{
		this.empId=empId;
	}
	
	Employee(long empCNo)
	{
		this.empCNo=empCNo;
	}
	
	Employee(String empName,String empBloodGroup)
	{
		this(empName);
		this.empBloodGroup=empBloodGroup;
	}
	Employee(String empName,int empId)
	{
		this(empName);
		this.empId=empId;
	}
	Employee(String empName,long empCNo)
	{
		this(empName);
		this.empCNo=empCNo;
	}
	Employee(int empId,String empName)
	{
		this(empName);
		this.empId=empId;
	}
	Employee(int empId,long empCNo)
	{
		this(empId);
		this.empCNo=empCNo;
	}
	Employee(int empId,int empSal)
	{
		this(empId);
		this.empSal=empSal;
	}
	Employee(long empCNo, int empId)
	{
		this(empId);
		this.empCNo=empCNo;
	}
	Employee(long empCNo, String empName)
	{
		this(empName);
		this.empCNo=empCNo;
	}
	
	Employee(String empName,String empBloodGroup,int empId)
	{
		this(empName,empBloodGroup);
		this.empId=empId;
	}
	Employee(String empName,String empBloodGroup,long empCNo)
	{
		this(empName,empBloodGroup);
		this.empCNo=empCNo;
	}
	Employee(String empName,int empId,String empBloodGroup)
	{
		this(empName,empBloodGroup);
		this.empId=empId;
	}
	Employee(String empName,long empCNo,String empBloodGroup)
	{
		this(empName,empBloodGroup);
		this.empCNo=empCNo;
	}
	Employee(String empName,long empCNo,int empId)
	{
		this(empName,empId);
		this.empCNo=empCNo;
	}
	Employee(String empName,int empId,long empCNo)
	{
		this(empName,empId);
		this.empCNo=empCNo;
	}
	Employee(String empName,int empId,int empSal)
	{
		this(empName,empId);
		this.empSal=empSal;
	}
	Employee(int empId,long empCNo,String empName)
	{
		this(empId,empCNo);
		this.empName=empName;
	}
	Employee(int empId,String empName,long empCNo)
	{
		this(empId,empCNo);
		this.empName=empName;
	}
	Employee(int empId,String empName,String empBloodGroup)
	{
		this(empId,empName);
		this.empBloodGroup=empBloodGroup;
	}
	Employee(long empCNo,int empId,String empName)
	{
		this(empId,empName);
		this.empCNo=empCNo;
	}
	Employee(long empCNo,String empName,int empId)
	{
		this(empId,empName);
		this.empCNo=empCNo;
	}
	Employee(long empCNo,String empName,String empBloodGroup)
	{
		this(empBloodGroup,empName);
		this.empCNo=empCNo;
	}
	Employee(long empCNo,int empId, int empSal)
	{
		this(empSal,empId);
		this.empCNo=empCNo;
	}
	Employee(int empId, int empSal,long empCNo)
	{
		this(empSal,empId);
		this.empCNo=empCNo;
	}
	Employee(int empId, int empSal,String empName)
	{
		this(empSal,empId);
		this.empName=empName;
	}
	Employee(String empName,String empBloodGroup,int empId,long empCNo)
	{
		this(empName,empBloodGroup,empId);
		this.empCNo=empCNo;
	}
	Employee(String empName,String empBloodGroup,int empId,int empSal)
	{
		this(empName,empBloodGroup,empId);
		this.empSal=empSal;
	}
	Employee(String empName,int empId,long empCNo,int empSal)
	{
		this(empName,empId,empSal);
		this.empCNo=empCNo;
	}
	Employee(String empName,int empId,long empCNo,String empBloodGroup)
	{
		this(empName,empId,empBloodGroup);
		this.empCNo=empCNo;
	}
	Employee(int empId,long empCNo,int empSal,String empName)
	{
		this(empName,empId,empSal);
		this.empCNo=empCNo;
	}
	Employee(int empId,long empCNo,String empName,String empBloodGroup)
	{
		this(empName,empId,empBloodGroup);
		this.empCNo=empCNo;
	}
	Employee(String empName,String empBloodGroup,int empId,long empCNo, int empSal)
	{
		this(empId,empCNo,empName,empBloodGroup);
		this.empSal=empSal;
	}
	public void display()
	{
		System.out.println("Employee Name is "+empName);
		System.out.println("Employee ID is "+empId);
		System.out.println("Employee Salary is "+empSal);
		System.out.println("Employee Contact Number is "+empCNo);
		System.out.println("Employee Blood Group is "+empBloodGroup);
	}
	
}
