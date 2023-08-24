package FileHandlingPrograms;
import java.io.FileWriter;
import java.io.IOException;
public class A2 {

	public static void main(String[] args) {
		String data ="Hello Good Afternoon, we are having a core java session";

		try
		{
		FileWriter obj=new FileWriter("C:\\corejava_swati_ma'am/java.txt");
		obj.write(data);
		obj.close();
		System.out.println("Data written in the file.");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
