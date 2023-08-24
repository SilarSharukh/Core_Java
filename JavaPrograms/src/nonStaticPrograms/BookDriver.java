package nonStaticPrograms;

public class BookDriver {
	public static void main(String[] args) {
		Book b0=new Book();
		b0.display();
		System.out.println("************************************************************************");
		Book b1=new Book("Wings of Fire","Dr.A.P.J.Abdul Kalaam",400);
		//b1.setProperty("Wings of Fire","Dr.A.P.J.Abdul Kalaam",400);
		b1.display();
		System.out.println("************************************************************************");
		Book b2=new Book("Harry Potter and Goblet of Fire","J.K.Rowling");
		//b2.setProperty("Harry Potter and Goblet of Fire","J.K.Rowling",600);
		b2.display();
		System.out.println("************************************************************************");
		Book b3=new Book("The Monk Who Sold His Ferrari",219);
		//b3.setProperty("Harry Potter and Goblet of Fire","J.K.Rowling",600);
		b3.display();
		System.out.println("************************************************************************");
		Book b4=new Book(160,"Rabindranath Tagore");
		//b4.setProperty("Harry Potter and Goblet of Fire","J.K.Rowling",600);
		b4.display();
		System.out.println("************************************************************************");
		Book b5=new Book("The Magic Of Lost Temple");
		//b5.setProperty("Harry Potter and Goblet of Fire","J.K.Rowling",600);
		b5.display();
		System.out.println("************************************************************************");
		Book b6= new Book(256);
		b6.display();
	
	}
}