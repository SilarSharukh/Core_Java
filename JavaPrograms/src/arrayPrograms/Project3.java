package arrayPrograms;

import java.util.Scanner;

public class Project3 {
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
	public static void prime(int a[])
	{int k=0;
		for(int n=0;n<a.length;n++)
		{
			boolean b=true;
			for (int n1=2;n1<=a[n]/2;n1++)
			{
				if(a[n]%n1==0)
				{
					b=false;
				}
			}
			if(b)
			{
				System.out.println(a[n]+" is the prime number in the array.");
				k=1;
			}
		}
		if(k==0)
			System.out.println("There are no prime numbers in Array.");
		
	}
	public static void happy(int a[])
	{
		int k=0;
		for (int n=0;n<a.length;n++) {
		int temp=a[n];
		int num=temp;
		while(num!=1 && num!=4)
		{
			num=happyCheck(num);
		}
		if(num==1)
		{
			System.out.println(temp+" is a Happy Number.");
			k=1;
		}
		}
		if(k==0)
		
			System.out.println("There are not even a single Happy Number in the Array.");
		
	
	}
	public static int happyCheck(int num)
	{
		int sum=0,product,last;
		for(;num>0;num/=10)
		{
			last=num%10;
			product=last*last;
			sum+=product;
		}
		return sum;
	}
	public static void harshad(int a[])
	{
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i],sum=0,fact;
			int n=temp;
			for(;n>0;n/=10)
			{
				fact=n%10;
				sum+=fact;
			}
			if (temp%sum==0)
			{
				System.out.println(temp+" is a Harshad or nivuin number.");
				k=1;
			}
		}
		if(k==0)
			System.out.println("There is not even a single Harshad or Nivin number in  an Array.");
	}
	public static void neon(int a[])
	{
		int k=0;
		for(int n=0;n<a.length;n++) {
			int square,sum=0,num=a[n];
			square=num*num;
			for(;square>0;square/=10)
			{
				int temp=square%10;
				sum+=temp;
			}
			if(sum==num)
			{
				System.out.println(num+" is a Neon Number.");
				k=1;
			}
		}
		if(k==0)
			System.out.println("There is not even a single Neon number in  an Array.");
	}
	public static void strong(int a[]) {
		int k=0;
		for(int n=0;n<a.length;n++) {
			int num=a[n];
			int fact,temp=num,sum=0,last;
			for(;num>0;num/=10)
			{
				last=num%10;
				fact=fact(last);
				sum+=fact;
			}
			if(sum==temp)
			{
				System.out.println(temp+" is a Strong Number.");
				k=1;
			}
		}
		if(k==0)
			System.out.println("There is not even a single Strong number in  an Array.");
	}
	public static int fact(int num)
	{
		int product=1;
		for(int n=num;n>0;n--)
		{
			product*=n;
		}
		return product;
	}
	public static void spy(int a[])
	{
		int k=0;
		for(int n=0;n<a.length;n++) {
			int num=a[n];
			int sum=0,product=1,last,temp=num;
			for(;num>0;num/=10)
			{
				last=num%10;
				sum+=last;
				product*=last;
			}
			if(sum==product)
			{
				System.out.println(temp+" is a SPY numvber.");
				k=1;
			}
		}
		if(k==0)
			System.out.println("There is not even a single Spy number in  an Array.");
	}
	public static void perfect(int a[])
	{
		int k=0;
		for(int i=0;i<a.length;i++) {
			int num=a[i];
			int temp=num,sum=0;
			for(int n=1;n<=num/2;n++)
			{
				if(num%n==0)
				{
					sum+=n;
				}
			}
			if(temp==sum)
			{
				System.out.println(temp+" is a Perfect Number.");
				k=1;
			}
		}
		if(k==0)
			System.out.println("There is not even a single Perfect number in  an Array.");
		
	}
	public static void palindrom(int a[])
	{
		int k=0;
		for(int n=0;n<a.length;n++)
		{
			int num=a[n];
			int rev=0,temp=num,last;
			for (;num>0;num/=10)
			{
				last=num%10;
				rev=rev*10+last;
			}
			if(rev==temp)
			{
				System.out.println(temp+" is a Palindrom number.");
				k=1;
			}
		}
		if(k==0)
			System.out.println("There is not even a single Palindrom number in  an Array.");
	}
	public static void display()
	{
		final int size=size();
		int a[]=createArray(size);
		read(a);
		prime(a);
		happy(a);
		harshad(a);
		neon(a);
		strong(a);
		spy(a);
		perfect(a);
		palindrom(a);
		
		
		
		
	}
}
