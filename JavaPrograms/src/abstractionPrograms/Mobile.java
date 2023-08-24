package abstractionPrograms;

abstract public class Mobile {

	
	public Mobile(String msg)
	{
		System.out.println(msg);
	}
	
	abstract public void call();
	abstract public void camera();
	abstract public void internet();
	abstract public void gps();
}
