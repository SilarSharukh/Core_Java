package arrayPrograms;
import java.util.Scanner;
public class A2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		final int n=input.nextInt();
		float f[]=new float[n];
		System.out.println("Enter the elements:");
		for (int i=0; i<f.length;i++)
		{
			f[i]=input.nextFloat();
		}
		System.out.print("The elements are: ");
		for(float ele:f)
		{
			System.out.print(ele+" ");
		}
		
	}

}
