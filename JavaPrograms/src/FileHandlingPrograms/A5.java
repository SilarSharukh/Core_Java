package FileHandlingPrograms;

import java.io.File;

public class A5 {
public static void main(String[] args) {
	File obj=new File("C:\\corejava_swati_ma'am/java.docx");
	if(obj.delete())
		System.out.println("File "+obj.getName()+" is deleted");
	else
		System.out.println("File "+obj.getName()+" is not deleted");
}
}
