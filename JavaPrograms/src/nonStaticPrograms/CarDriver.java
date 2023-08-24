package nonStaticPrograms;

public class CarDriver {
	public static void main(String[] args) {
		Car c0=new Car();
		c0.display();
		System.out.println("*******************************************************");
		Car c1=new Car("Hyundai","Verna","Silver",1000000);
		c1.display();
		System.out.println("*******************************************************");
		Car c2=new Car("Marcediz","Marc",5000000);
		c2.display();
		System.out.println("*******************************************************");
		Car c3=new Car("Tayota","Innova Crysta","White");
		c3.display();
		System.out.println("*******************************************************");
		Car c4=new Car("Maruthi Suzuki","Caiz");
		c4.display();
		System.out.println("*******************************************************");
		Car c5=new Car("Mahindra",1800000);
		c5.display();
		System.out.println("*******************************************************");
		Car c6=new Car("Mitsubushi");
		c6.display();
		System.out.println("*******************************************************");
		Car c7=new Car(1800000);
		c7.display();
		System.out.println("*******************************************************");
		Car c8=new Car(1800000,"Kwid");
		c8.display();
		System.out.println("*******************************************************");
		Hotel h1= new Hotel("abc","abc","abc","abc");
		h1.display();
		System.out.println("*******************************************************");
		Hotel h2= new Hotel();
		h2.setProperty("abc","abc","abc","abc");
		h2.display();
		System.out.println("*******************************************************");
		Hotel h3= new Hotel();
		System.out.println("The value of Owner Non-Static variable in Hotel Class is "+h3.owner);
		System.out.println("************************************************************************");
		Hotel h4= new Hotel("abc","Ajantha Group","abc","abc");
		System.out.println("The value of Owner Non-Static variable in Hotel Class is "+h4.owner);
	
	}

}
