package arrayPrograms;
import java.util.Scanner;
public class BinarySearching {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size: ");
	final int size=sc.nextInt();
	int f[]=new int[size];
	int mid=0,start=0,last=f.length-1,k=0;
	System.out.println("Enter the elements: ");
	for(int n=0;n<f.length;n++)
	{
		f[n]=sc.nextInt();
	
	}
	System.out.println("Enter the number to be searched: ");
	int searchNo=sc.nextInt();
	while(start<=last)
	{
	mid=(start+last)/2;
	if(searchNo>f[mid])
		start=mid+1;
	if(searchNo<f[mid])
		last=mid-1;
	if(searchNo==f[mid])
		{
		k=1;
		break;
		}
	}
	if(k==1)
		System.out.println("The number "+searchNo+" is present at "+mid+" position.");
	else
		System.out.println("The number "+searchNo+" is not present in an Array.");
}
}
