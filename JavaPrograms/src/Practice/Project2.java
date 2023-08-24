package Practice;
import java.util.Scanner;

public class Project2 {
	public static Scanner sc=new Scanner(System.in);
	 public static int size()
	{
		System.out.println("Enter the Size of Array: ");
		return sc.nextInt();
	}
	public static int[] createArray(int size)
	{
		return new int[size];
	}
	public static void read(int []a)
	{
		System.out.println("Enter the Elements: ");
		for (int n=0;n<=a.length;n++)
		{
			a[n]=sc.nextInt();
		}
	}
	public static int max(int []a)
	{
		int max=a[0];
		for(int ele:a)
		{
			if(ele>max)
				max=ele;
		}
		return max;
	}
	
	public static int min(int []a)
	{
		int min=a[0];
		for(int i=0;i<=a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}
	public static int sum(int[] a)
	{
		int sum=0;
		for(int ele:a)
		{
			sum+=ele;
		}
		return sum;
	}
	public static double avg(double sum,double size)
	{
		return sum/size;
	}
	public static void main(String[] args) {
		int size=size();
		int []a =createArray(size);
		read(a);
		System.out.println(a[0]);
		int max=max(a);
		int min=min(a);
		System.out.println(max);
		System.out.println(min);
		
	}
}
