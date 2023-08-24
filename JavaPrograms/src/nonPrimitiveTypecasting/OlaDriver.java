package nonPrimitiveTypecasting;

public class OlaDriver {
public static void main(String[] args) {
	Prime c1=new Prime(90,"Silver");
	Ola c2=c1;// upCasting
	System.out.println(c2.price);
	
	Mini c3=new Mini(105,"Black");
	Ola c4=c3;
	c3=(Mini)c4;//downCasting
	System.out.println(c3.Color);
	
	System.out.println(c3 instanceof Mini );
	Auto c5= new Auto(105,"Yellow");
	Ola c6=c5;
	Auto c8=(Auto)c6;
	System.out.println(c8.price);
	
	 Ola c7=new Ola(28);
	 System.out.println((Auto)c5);//ClassCastException

	 
}
}
