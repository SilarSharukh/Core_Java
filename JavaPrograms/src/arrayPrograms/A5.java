package arrayPrograms;
import java.util.Scanner;
public class A5 {
	public static void main(String[] args) {
		int a[]= {12,-25,15,758,96,45,78,23,-556,78,41};
		System.out.println("Even numbers are: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		System.out.println("Odd numbers are: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
		// numbers at even index
		System.out.println("Even ibdex numbers are: ");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
				if(a[i]%2==0)
				System.out.println(a[i]);
		}
		System.out.println("Odd numbers at odd positions are: ");
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
		// print all two digit numbers in array
		System.out.println("Two digit numbers numbers are: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>9 && a[i]<100)
				System.out.println(a[i]);
		}
		System.out.println("positive numbers numbers are: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
				System.out.println(a[i]);
		}
		// numbers which are divisible by 5
		System.out.println("numbers divisible by 5 are: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%5==0)
				System.out.println(a[i]);
		}
		// numbers which are last number is 7
				System.out.println("numbers ending with 1 are: ");
				for(int i=0;i<a.length;i++)
				{
					if(a[i]%10==1)
						System.out.println(a[i]);
				}
		// sum of even number
				int sumEven=0,sumOdd=0;
				for(int i=0;i<a.length;i++)
				{
					if(a[i]%2==0)
						sumEven+=a[i];
					else
						sumOdd+=a[i];
				}
				System.out.println("Sum of even numbers are: "+sumEven);
				System.out.println("Sum of odd numbers are: "+sumOdd);
			// sum of two digit numbers
			int sumTwo=0,sumNotTwo=0;
				for(int i=0;i<a.length;i++)
				{
					if(a[i]>9 && a[i]<100)
						sumTwo+=a[i];
					else
					sumNotTwo+=a[i];
				}
				System.out.println("Sum of two digit numbers are: "+sumTwo);
				System.out.println("Sum of numbers which are not 2 digits: "+sumNotTwo);
			// product og even and odd numbers
				int proEven=1,proOdd=1;
				for(int i=0;i<a.length;i++)
				{
					if(a[i]%2==0)
						proEven*=a[i];
					else
						proOdd*=a[i];
				}
				System.out.println("Product of even numbers are: "+proEven);
				System.out.println("Product of odd numbers are: "+proOdd);
			// Product of two digit number
				int proTwo=1,proNotTwo=1;
					for(int i=0;i<a.length;i++)
						{
							if(a[i]>9 && a[i]<100)
								proTwo*=a[i];
							else
								proNotTwo*=a[i];
						}
					System.out.println("Product of two digit numbers are: "+proTwo);
					System.out.println("Product of numbers which are not 2 digits: "+proNotTwo);
					int pro1=1,pro2=1;
					for(int i=0;i<a.length;i++)
						{
							if(a[i]>9 && a[i]<100)
								proTwo*=a[i];
							else
								proNotTwo*=a[i];
						}
					System.out.println("Product of two digit numbers are: "+proTwo);
					System.out.println("Product of numbers which are not 2 digits: "+proNotTwo);

	}
}
