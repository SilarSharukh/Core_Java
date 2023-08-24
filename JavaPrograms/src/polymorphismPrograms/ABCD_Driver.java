package polymorphismPrograms;

public class ABCD_Driver {
public static void main(String[] args) {
	A obj1=new C();
	System.out.println("When we extecute A obj1=new C(); ");
	obj1.m1();
	System.out.println(obj1.a);
	System.out.println(obj1.b);
	System.out.println("**********************************************");
	
	B obj2=new D();
	System.out.println("When we extecute B obj2=new D(); ");
	obj2.m1();
	System.out.println(obj2.a);
	System.out.println(obj2.b);
	System.out.println("**********************************************");
	
	C obj3=(C)obj2;
	System.out.println("When we extecute C obj3=(C)obj2; ");
	obj3.m1();
	System.out.println(obj3.a);
	System.out.println(obj3.b);
	System.out.println("**********************************************");
	
	B obj4= new C();
	System.out.println("When we extecute B obj4= new C(); ");
	A obj5=obj4;
	obj4.m1();
	System.out.println(obj4.a);
	System.out.println(obj4.b);
	System.out.println("**********************************************");
	System.out.println("When we extecute A obj5=obj4; ");
	obj5.m1();
	System.out.println(obj5.a);
	System.out.println(obj5.b);
	System.out.println("**********************************************");
	
	B obj6=(B)obj5;
	System.out.println("When we extecute B obj6=(B)obj5; ");
	obj6.m1();
	System.out.println(obj6.a);
	System.out.println(obj6.b);
	System.out.println("**********************************************");
	
	
	D obj7=(D)obj3;
	System.out.println("When we extecute D obj7=(D)obj3 ");
	
	obj7.m1();
	System.out.println(obj7.a);
	System.out.println(obj7.b);
	
}
}
