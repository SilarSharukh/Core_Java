package FileHandlingPrograms;
import java.io.File;
import java.io.IOException;
public class A1 {
public static void main(String[] args) {
	File obj=new File("C:\\corejava_swati_ma'am/java.txt");
	try {
	if(obj.createNewFile())
		System.out.println("File Created "+obj.getName());
	else
		System.out.println("File already existed.");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	
}
}
