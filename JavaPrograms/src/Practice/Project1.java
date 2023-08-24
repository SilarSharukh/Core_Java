package Practice;
import java.util.Scanner;
public class Project1 {
public static Scanner sc=new Scanner(System.in);
final public static int size()
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

	

}
