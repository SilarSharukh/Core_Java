package nonStaticPrograms;

public class DusterDriver {
	public static void main(String[] args) {
		Duster d1= new Duster();
		d1.display();
		System.out.println("********************");
		Duster d2= new Duster("Cello");
		d2.display();
		System.out.println("********************");
		Duster d3= new Duster(171);
		d3.display();
		System.out.println("********************");
		Duster d4= new Duster("ClassMate",145);
		d4.display();
		System.out.println("********************");
		Duster d5= new Duster(155,"Yellow");
		d5.display();
		System.out.println("********************");
		Duster d6= new Duster("Doms","Red");
		d6.display();
		System.out.println("********************");
		Duster d7= new Duster("Yajnas","Brown",279);
		d7.display();
		
	}

}
