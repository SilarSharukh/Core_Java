package nonPrimitiveTypecasting;

public class ShapeDriver {
public static void main(String[] args) {
	Circle c=new Circle(12.0,3.6);
	System.out.println(c.area);
	System.out.println(c.radius);
	Shape s=c;//upCasting
	System.out.println(s.area);
	c=(Circle)s;
	//System.out.println(s.radius); it will give us error because child member can't be accessed with parent object reference
	System.out.println(c instanceof Circle);
	System.out.println(s instanceof Circle);
	System.out.println(s instanceof Shape);
	System.out.println(c instanceof Shape);
	
	Circle c1=(Circle)s;
	System.out.println(c1.radius);
	System.out.println(c1.area);
	Shape s1=new Circle(11.89,4.67);
	System.out.println(s1.area);
	Circle c2=(Circle)s1;
	System.out.println(c2.radius);
	System.out.println(c2.area);
	//System.out.println(s.radius);
	System.out.println(s==c);
	System.out.println(c2 instanceof Circle);
	System.out.println(s1 instanceof Circle);
	System.out.println(s1 instanceof Shape);
	System.out.println(c2 instanceof Shape);
	
}
}
