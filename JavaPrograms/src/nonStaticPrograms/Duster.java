package nonStaticPrograms;

public class Duster {
// non static variable
	String brand;
	String color;
	double price;
// non static multiline initializer
	{
		System.out.println("Rub without Mark");
		System.out.println("Lets Learn");
	}
// Non argument constructor
	Duster()
	{
		
	}
// constructor overloading
	Duster(String brand)
	{	
		this.brand=brand;	
	}
	Duster(String brand, double price)
	{
		this(brand);
		this.price=price;
	}
	Duster(double price,String color)
	{
		this(price);
		this.color=color;
	}
	Duster(String brand,String color)
	{
		this(brand);
		this.color=color;
	}
	Duster(String brand,String color,double price)
	{
		this(brand,price);
		this.color=color;
	}
	Duster(double price)
	{
		this.price=price;
	}
// non static method
	public void display()
	{
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.price);
	}
}
