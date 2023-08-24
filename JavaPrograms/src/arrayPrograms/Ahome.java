package arrayPrograms;
import java.util.Scanner;
public class Ahome {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		final int n=input.nextInt();
		int f[]=new int[n];
		System.out.println("Enter the elements:");
		for (int i=0; i<f.length;i++)
		{
			f[i]=input.nextInt();
		}
		int sum=0;
		double avg;
		for(int ele:f)
		{
			sum+=ele;
		}
		avg=(double)sum/n;
		System.out.println(" The Sum of the Numbers is: "+sum);
		System.out.println(" The Average of the Numbers is: "+avg);
	}
}
