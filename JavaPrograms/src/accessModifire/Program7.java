package accessModifire;

public class Program7 {
public int a=20;
public Program7()
{
	System.out.println("Program7");
}
public void display()
{
	System.out.println("Public display()");
}
public static void main(String[] args) {
	Program7 obj=new Program7();
	System.out.println(obj.a);
	obj.display();
			
}
}
