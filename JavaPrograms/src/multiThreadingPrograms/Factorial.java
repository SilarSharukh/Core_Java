package multiThreadingPrograms;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Factorial extends Thread {
int num;
int fact=1;
public Factorial(int num) {
	this.num = num;
}
@Override
public void run()
{
	PrintWriter pw=null;
	try {
	pw=new PrintWriter("C:\\corejava_swati_ma'am/"+getName()+".txt");
	for(int i=1;i<=num;i++)
	{
		fact*=i;	
	}
	pw.println(fact+" is the factorial of "+num);
	pw.println(getName());
	pw.println(getId());
	//pw.setPriority(8);
	pw.println(getPriority());
	pw.println(getClass());
	pw.println(getState());
	pw.println(getThreadGroup());
	System.out.println("Task Completed");
	}
	catch(FileNotFoundException e)
	{
		System.out.println("Cannot fount the file"+getName()+".");
	}
	finally
	{
		pw.flush();
		pw.close();
	}
}

}
