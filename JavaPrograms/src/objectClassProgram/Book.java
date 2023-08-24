package objectClassProgram;
import java.util.Objects;
public class Book {
String bookName;
double price;
public Book(String bookName, double price) 
{
	this.bookName = bookName;
	this.price = price;
}
@Override
public String toString()
{
	return "Book Name="+bookName+" Book price ="+price;
}
@Override
public boolean equals(Object o)//up cating
{
	Book temp=(Book)o;//down casting
	/*if(this.price==temp.price || this.bookName==temp.bookName)
		return true;
	else
		return false;*/
	return this.bookName.equals(temp.bookName);
}// this--> reference of b1 && temp--> seference of b2
@Override
public int hashCode()
{
	return Objects.hash(bookName,price);
}
}
