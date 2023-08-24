package stringPrograms;
import java.util.Scanner;
public class Program1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the the Message:");
	String s1=sc.nextLine();
	//String s1=" Kolar Gold Field";
	char c1[]=s1.toCharArray();
	System.out.print("The code is : ");
	for(int i=0;i<=c1.length-1;i++)
	{
		if(c1[i]!=' '&& (i==0 || c1[i-1]==' '))
		{
			System.out.print(c1[i]+" ");
		}
	}
	
}
}
