package nonPrimitiveTypecasting;

public class ShapeDriver1 {
public static void main(String[] args) {
	Shape s1=new Shape(14.34);
	System.out.println(s1);
	System.out.println(s1.area);
	//System.out.println((Circle)s);Class Cast Exception
	System.out.println(s1 instanceof Shape);
	System.out.println(s1 instanceof Circle);
}
}
