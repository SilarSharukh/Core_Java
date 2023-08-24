package FileHandlingPrograms;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A3 {
public static void main(String[] args) {
	File obj=new File("C:\\corejava_swati_ma'am/java.txt");
	try {
	Scanner sc=new Scanner(obj);
	while(sc.hasNextLine())
	{
		String str=sc.nextLine();
		System.out.println(str);
	}
	sc.close();
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}


}
}
