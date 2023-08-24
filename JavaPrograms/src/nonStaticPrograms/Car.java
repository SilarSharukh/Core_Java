package nonStaticPrograms;

public class Car {
	static int count=1;
	//multiline non static initializer
	{
		System.out.println("Multi line non static initializer initialized for c"+count);
		count++;
	}
	static
	{
		System.out.println("Multi line static initializer is initialized only one time.");
		System.out.println("*********************************************************************");
	}
	String name;
	String model;
	String color;
	double price;
	Car()
	{
		
	}
	Car(String name)
	{
		this.name=name;
	}
	Car(double price)
	{
		this.price=price;
	}
	Car(String name,String model)
	{
		this(name);
		this.model=model;
	}
	Car(String name,double price)
	{
		this(name);
		this.price=price;
	}
	Car(double price, String model)
	{
		this(price);
		this.model=model;
	}
	Car(String name,String model,String color)
	{
		this(name,model);
		this.color=color;
	}
	Car(String name,String model,double price)
	{
		this(name,model);
		this.price=price;
	}
	public Car(String name, String model,String color, double price)
	{
		this(name,model,color);
		this.price=price;
	}
	public void display() 
	{
		System.out.println("The Brand of The car is "+name+".");
		System.out.println("The Model of The car is "+model+".");
		System.out.println("The Colour of The car is "+color+".");
		System.out.println("The Price of The car is "+price+".");
	}

}
