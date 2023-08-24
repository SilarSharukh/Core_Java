package nonStaticPrograms;

public class Mobile {
String brand;
int ram;
int rom;
double price;
public Mobile()
{
	System.out.println("No Argument Constructor");
}
/*public void setProperty(String brand,int ram, int rom, double price )
{
	this.brand=brand;
	this.ram=ram;
	this.rom=rom;
	this.price=price;
}*/
public Mobile(String brand,int ram, int rom, double price )
{
	this.brand=brand;
	this.ram=ram;
	this.rom=rom;
	this.price=price;
}
public void display()
	{
		System.out.println("The Brand of mobile is "+brand);
		System.out.println("It's RAM is of "+ram+" GB.");
		System.out.println("It's ROM is of "+rom+" GB.");
		System.out.println("The Price of mobile is "+price+"/-.");	
	
	}

}
