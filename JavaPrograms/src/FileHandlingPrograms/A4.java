package FileHandlingPrograms;

import java.io.File;

public class A4 {

	public static void main(String[] args) {
		File obj=new File("C:\\corejava_swati_ma'am/java.txt");
		if(obj.exists())
		{
				System.out.println("Absolute path :"+obj.getAbsolutePath());
				System.out.println("File name : "+obj.getName());
				System.out.println("Parent name : "+obj.getParent());
				System.out.println("File is readable : "+obj.canRead());
				System.out.println("File is writable : "+obj.canWrite());
				System.out.println("Is file executable : "+obj.canExecute());
				System.out.println("File size : "+obj.length());
				System.out.println("Path : "+obj.getPath());
				System.out.println("Is it a file? "+obj.isFile());
				System.out.println("Is File Hidden? : "+obj.isHidden());
				System.out.println("Total space : "+obj.getTotalSpace());
				System.out.println("Unused space : "+obj.getUsableSpace());
				System.out.println("last modiofied : "+obj.lastModified());
				
				
				
				
		}		
				
	}

}
