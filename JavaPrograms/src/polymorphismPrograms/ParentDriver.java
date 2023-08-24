package polymorphismPrograms;

public class ParentDriver {
public static void main(String[] args) {
	Parent p1=new Son();
	p1.carBrand();
	p1.carColor();
	
	Parent p2= new Doughter();
	p2.carBrand();
	p2.carColor();
	
	Parent p3=new Parent();
	p3.carColor();
	p3.carBrand();
	
}
}
