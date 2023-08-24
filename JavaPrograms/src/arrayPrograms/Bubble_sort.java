package arrayPrograms;

import java.util.Scanner;

public class Bubble_sort {
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
	for(int i=0;i<f.length-1;i++)
	{
		for(int j=0;j<f.length-i-1;j++) {
			/*if(f[j]>f[j+1]) {// ascending order
				int temp=f[j];
				f[j]=f[j+1];
				f[j+1]=temp;
			}*/
			if(f[j]<f[j+1]) {// decending order
				int temp=f[j];
				f[j]=f[j+1];
				f[j+1]=temp;
			}	
		}
	}
	for(int i=0;i<f.length;i++)
	{
		System.out.print(f[i]+" ");
	}
}
}
