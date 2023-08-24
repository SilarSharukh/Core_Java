package objectClassProgram;

public class BookDriver2 {
	public static void main(String[] args) {
		

		Book b1=new Book("java",289.32);
	Book b2=new Book("java",289.32);
	System.out.println(b1.bookName);
	System.out.println(b1.price);
	System.out.println(b2.bookName);
	System.out.println(b2.price);
	System.out.println(b1==b2);
	System.out.println(b1.equals(b2));
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b1.hashCode());
	System.out.println(b2.hashCode());
	System.out.println(b1.hashCode()==b2.hashCode());
	int h1=b1.hashCode();
	int h2=b2.hashCode();
	System.out.println(h1==h2);
	}
}
