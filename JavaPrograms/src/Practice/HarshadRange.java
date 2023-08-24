package Practice;
import java.util.Scanner;
public class HarshadRange {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the range: ");
		int num1=input.nextInt();
		int num2=input.nextInt();
		System.out.println("The Harshad numbers are: ");
		for(int n=num1;n<=num2;n++)
		{
			if(harshad(n))
			{
				System.out.print(n+" ");
			}
		}
	}
	public static boolean harshad(int num)
	{
		int temp=num,fact,sum=0;
		for(;num>0;num/=10)
		{
			fact=num%10;
			sum+=fact;
		}
		if(temp%sum==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
