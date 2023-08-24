package nonStaticPrograms;

public class MobileDriver {
public static void main(String[] args) {
	Mobile m1=new Mobile("Samsung",8,256,18000);
	//m1.setProperty("Samsung",8,256,18000);
	m1.display();
	System.out.println("***********************************************");
	Mobile m2=new Mobile("Lenovo",4,128,15000);
	/*m2.brand="Lenovo";
	m2.ram=4;
	m2.rom=128;
	m2.price=15000;*/
	m2.display();
	System.out.println("***********************************************");
	Mobile m3=new Mobile("Vevo",3,128,11000);
	/*m3.brand="Vivo";
	m3.ram=3;
	m3.rom=128;
	m3.price=11000;
	System.out.println("The Brand of mobile is "+m3.brand);
	System.out.println("It's RAM is of "+m3.ram+" GB.");
	System.out.println("It's ROM is of "+m3.rom+" GB.");
	System.out.println("The Price of mobile is "+m3.price+"/-.");
	*/
	m3.display();
	System.out.println("***********************************************");
	Mobile m4=new Mobile("Oppo",5,128,15000);
	m4.display();

	System.out.println("***********************************************");
	Mobile m5=new Mobile("Realme 11 pro+",12,256,31000);
	m5.display();
}
}
