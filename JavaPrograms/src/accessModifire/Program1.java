package accessModifire;

public class Program1 {
private int a =10;
private Program1()
{
	System.out.println("Private class constructor");
}
private void display()
{
	System.out.println("Private display method");
}
public static void main(String[] args) {
	Program1 obj=new Program1();
	System.out.println(obj.a);
	obj.display();
}

}
