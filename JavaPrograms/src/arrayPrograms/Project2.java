package arrayPrograms;
import java.util.Scanner;
public class Project2 {
	public static Scanner sc=new Scanner(System.in);
	public static int size()
	{
		System.out.println("Enter the size of the Array: ");
		return sc.nextInt();
	}
	public static int[] createArray(int size) {
		return new int[size];
	}
	public static void read(int []a) {
		System.out.println("Enter the elements");
		for(int n=0;n<a.length;n++) {
			a[n]=sc.nextInt();
		}
	}
	public static int sum(int a[])
	{
		int sum=0;
		for (int ele:a)
		{
			sum+=ele;
		}
		return sum;
	}
	public static double avg(double sum,double size)
	{
		return sum/size;
	}
	public static int max(int a[])
	{
		int max=a[0];
		for(int ele:a)
		{
			if(ele>max)
				max=ele;
		}
		return max;
	}
	public static int min(int a[])
	{
		int min=a[0];
		for(int ele:a)
		{
			if(ele<min)
				min=ele;
		}
		return min;
	}
	public static void reverse(int a[])
	{
		System.out.print("The Reverse Array is : { ");
		for (int n=a.length-1;n>=0;n--)
		{
			 System.out.print(a[n]+" ");
			 
		}
		System.out.print("}");
		System.out.println();
		
	}
	public static void duplicate(int a[])
	{
		int k=0;
		for(int n=0;n<a.length;n++)
		{
			for (int j=n+1;j<a.length;j++)
			{
				if(a[n]==a[j])
				{
					System.out.println(a[n]+" is a Duplicate element.");
					k=1;
				}
				
			}
		}
		if(k==0)
			System.out.println("There are no dupicate elements in Array.");
	}
	public static void display() {
		final int size=size();
		int a[]=createArray(size);
		read(a);
		int sum=sum(a);
		System.out.println("The sum of the elements in Array is "+sum);
		double average=avg(sum,size);
		System.out.println("The Average of the elements in Array is "+average);
		int max=max(a);
		System.out.println("The Largest number in the Array is "+max);
		int min=min(a);
		System.out.println("The Smallest number in the Array is "+min);
		reverse(a);
		duplicate(a);
			
	
		
	
		
		
		
	}
}
