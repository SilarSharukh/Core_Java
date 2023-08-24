package abstractionPrograms;

public class Samsung extends Mobile{

	public Samsung(String msg)
	{
		super(msg);
		System.out.println("Child class constructor ");
	}
	public void call()
	{
		System.out.println("Call facility available");
	}
	public void camera()
	{
		System.out.println("Camera facility available");
	}
	public void internet()
	{
		System.out.println("Internet facility available");
	}
	public void gps()
	{
		System.out.println("GPS facility available");
	}
	public void m1()
	{
		System.out.println("Samsung m1()");
	}
}
