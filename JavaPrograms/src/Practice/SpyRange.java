package Practice;
import java.util.Scanner;
public class SpyRange {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the range:");
	int num1=input.nextInt();
	int num2=input.nextInt();
	System.out.print("The Spy numbers between "+num1+" and "+num2+" are :");
	for(int n=num1;n<=num2;n++)
	{
		if(spy(n))
		{
			System.out.print(n+" ");
		}
	}
	int count=0;
	for(int n=num1;n<=num2;n++)
	{
		if(spy(n))
		{
			count++;
		}
	}
	System.out.println();
	System.out.println("Count of Spy numbers is: "+count);
}
public static boolean spy(int num)
{
	int sum=0,product=1,last,temp=num;
	for(;num>0;num/=10)
	{
		last=num%10;
		sum+=last;
		product*=last;
	}
	if(sum==product)
	{
		return true;
	}
	else
	{
		return false;
	}
}
}
