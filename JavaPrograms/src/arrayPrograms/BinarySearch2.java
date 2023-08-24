package arrayPrograms;

import java.util.Scanner;

public class BinarySearch2 {
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
	int index=binary(f,searchNo,start,last);
	if(index==-1)
		System.out.println("The "+searchNo+" is not in the array.");
	else
		System.out.println("The "+searchNo+" is in the array at "+index+" position.");

}
public static int binary(int a[],int sNo,int start,int last) {
	while(start<=last)
	{
	int mid=(start+last)/2;
	if(sNo>a[mid])
		start=mid+1;
	if(sNo<a[mid])
		last=mid-1;
	if(sNo==a[mid])
		{
			return mid;
		}
	}
	return -1;
}
}
