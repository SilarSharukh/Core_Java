package abstractionPrograms;

public class MobileDriver {
public static void main(String[] args) {
	Mobile m1=new Samsung("Parent class Constructor");
	m1.call();
	m1.camera();
	m1.internet();
	m1.gps();
	
	System.out.println("***********************************");
	Samsung m2=new Samsung("Parent class Constructor ");
	Mobile m3=m2;
	m2=(Samsung)m3;
	m2.m1();
	m2.call();
	m2.camera();
	m2.internet();
	m2.gps();
}
}
