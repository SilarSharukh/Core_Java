package arrayPrograms;
import java.util.Scanner;
public class LinearSearch2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size: ");
	final int size=sc.nextInt();
	int f[]=new int[size];
	System.out.println("Enter the elements: ");
	for(int n=0;n<f.length;n++)
	{
		f[n]=sc.nextInt();
	
	}
	System.out.println("Enter the number to be searched: ");
	int searchNo=sc.nextInt();
	int index=linear(f,searchNo);
	if(index==-1)
		System.out.println("The "+searchNo+" is not in the array.");
	else
		System.out.println("The "+searchNo+" is in the array at "+index+" position.");
}
public static int linear(int a[], int sNo)
{
	for (int i=0;i<a.length;i++)
	{
		if(a[i]==sNo)
		{
			return i;
		}
	}
	return -1;
}
}
