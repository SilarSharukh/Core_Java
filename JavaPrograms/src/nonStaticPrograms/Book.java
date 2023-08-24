package nonStaticPrograms;

public class Book {
	String author;
	String title;
	double price;
	public Book()
	{
		System.out.println("No Argument Constructor"); 	
	}
	Book(String author)
	{
		this.author=author;
	}
	Book(double d)
	{
		this.price=d;
	}
	Book(String author,String title)
	{
		this(author);
		this.title=title;
	}
	Book(String title,double d)
	{
		this(d);
		this.title=title;
		
	}
	Book(double d, String str1)
	{
		this(d);
		this.author=str1;
	}
	
	public Book(String str1, String str2, double d)
	{
		this(str1,str2);
		this.price=d;
	}
	/*public void setProperty(String str1, String str2, double d)
	{
		this.author=str2;
		this.title=str1;
		this.price=d;
	}*/
	public void display()
	{
		System.out.println("The Author of the book "+author);
		System.out.println("The Title of the book "+title);
		System.out.println("The price of the book "+price);
		
	}

}
