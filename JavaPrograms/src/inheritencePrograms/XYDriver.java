package inheritencePrograms;

public class XYDriver {
	public static void main(String[] args) {
		X obj=new X();
		System.out.println(obj.a);
		System.out.println(obj.i);
		System.out.println(X.i);
		
		obj.display1();
		obj.display2();
		//System.out.println(obj.a1);
		Y obj1=new Y();
		System.out.println(obj1.a1);
		System.out.println(obj1.a);
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		System.out.println(Y.i);
		System.out.println(Y.j);
		Y.demo1();
		Y.display1();
		obj1.demo2();
		obj1.demo1();
		obj1.display1();
		obj1.display2();
	}

}
