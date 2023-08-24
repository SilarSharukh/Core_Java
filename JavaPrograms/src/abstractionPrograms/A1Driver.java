package abstractionPrograms;

public class A1Driver {
public static void main(String[] args) {
	//A1 obj=new A1();
	A2 obj1=new A2();// not upCasting
	obj1.m1();
	obj1.m2();
	System.out.println("*********************************************");
	A1 obj2=new A2();// upCasting
	obj2.m1();
	obj2.m2();
	System.out.println("*********************************************");
	A3 obj3=new A4();
	obj3.m1();
	obj3.m2();
	obj3.m3();
	System.out.println("*********************************************");
	A4 obj4=new A4();
	A1 obj5=obj4;
	obj4=(A4)obj5;
	obj4.m1();
	obj4.m2();
	obj4.m3();
}
}
