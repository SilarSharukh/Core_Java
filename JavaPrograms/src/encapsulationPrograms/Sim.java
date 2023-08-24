package encapsulationPrograms;

public class Sim {
	private String serviceProvider;
	private long simNo;
	private double balance;
	private String color;
	// getter() for servicePrivider
	public String getServiceProvider()
	{
		return serviceProvider;
	}
	//setter for 
	public void setServiceProvider(String serviceProvider)
	{
		this.serviceProvider=serviceProvider;
	}
//
	public long getSimNo()
	{
		return simNo;
	}
	public void setSimNo(long simNo)
	{
		this.simNo=simNo;
	}
	//
	public double getBalance()
	{
		return balance;
	}
	//
	public void setBalance(double balance)
	{
		this.balance=balance;;
	}
	//
	public String getColor()
	{
		return color;
	}
	Sim(){}
	Sim(String serviceProvider)
	{
		this.serviceProvider=serviceProvider;
	}
	
	Sim(long simNo)
	{
		this.simNo=simNo;
	}
	
	Sim(double balance)
	{
		this.balance=balance;
	}
	
	Sim(String serviceProvider, long simNo)
	{
		this(serviceProvider);
		this.simNo=simNo;
	}
	
	Sim(String serviceProvider, double balance)
	{
		this(serviceProvider);
		this.balance=balance;
	}
	
	Sim(String serviceProvider, String color)
	{
		this(serviceProvider);
		this.color=color;
	}
	
	Sim(long simNo, String serviceProvider)
	{
		this(simNo);
		this.serviceProvider=serviceProvider;
	}
	
	Sim(long simNo, double balance)
	{
		this(simNo);
		this.balance=balance;
	}
	
	Sim(double balance, String serviceProvider)
	{
		this(balance);
		this.serviceProvider=serviceProvider;
	}
	
	
	Sim(String serviceProvider, long simNo, double balance)
	{
		this(serviceProvider,simNo);
		this.balance=balance;
	}
	
	Sim(String serviceProvider, long simNo, String color)
	{
		this(serviceProvider,simNo);
		this.color=color;;
	}
	
	Sim(String serviceProvider, double balance, String color)
	{
		this(serviceProvider,balance);
		this.color=color;
	}
	
	Sim(String serviceProvider, String color, long simNo)
	{
		this(serviceProvider,color);
		this.simNo=simNo;
	}
	
	Sim(String serviceProvider, String color, double balance)
	{
		this(serviceProvider,color);
		this.balance=balance;
	}
	
	Sim(long simNo,double balance, String color)
	{
		this(simNo,balance);
		this.color=color;
	}
	
	Sim(long simNo, String color, double balance)
	{
		this(simNo,balance);
		this.color=color;
	}
	
	Sim(long simNo, String serviceProvider, String color)
	{
		this(simNo,serviceProvider);
		this.color=color;
	}
	
	
	public Sim(String serviceProvider, long simNo, double balance, String color)
	{
		this.serviceProvider=serviceProvider;
		this.balance=balance;
		this.simNo=simNo;
		this.color=color;
	}
	
	public void simDetails()
	{
		System.out.println("Service Provider = "+this.serviceProvider);
		System.out.println("Sim no = "+this.simNo);
		System.out.println("Balance = "+this.balance);
		System.out.println("Sim Color = "+this.color);
	}
}
