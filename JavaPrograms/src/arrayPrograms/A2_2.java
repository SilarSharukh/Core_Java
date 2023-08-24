package arrayPrograms;
import java.util.Scanner;
public class A2_2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		final int n=input.nextInt();
		String f[]=new String[n];
		System.out.println("Enter the elements:");
		for (int i=0; i<f.length;i++)
		{
			f[i]=input.next();
		}
		System.out.println("The Days in a Week  are: ");
		for(String ele:f)
		{
			System.out.println(ele+" ");
		}
		
	}
}
