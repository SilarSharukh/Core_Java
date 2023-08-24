package nonStaticPrograms;

public class Hotel {
	String name;
	String owner;
	String loc;
	String gst;
	public Hotel()
	{
		System.out.println("No Argument method");
	}
	public Hotel(String str1,String str2, String str3, String n)
	{
		this.name=str1;
		this.owner=str2;
		this.loc=str3;
		this.gst=n;
	}
	public void display()
	{
		System.out.println("The Name of Hotel is "+name);
		System.out.println("The Owner of Hotel is "+owner);
		System.out.println("The Location of Hotel is "+loc);
		System.out.println("The GST Number  of Hotel is "+gst);
	}

	public void setProperty(String str1,String str2, String str3, String n)
	{
		this.name=str1;
		this.owner=str2;
		this.loc=str3;
		this.gst=n;
	}
}
