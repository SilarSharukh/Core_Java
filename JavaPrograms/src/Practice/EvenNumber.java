package Practice;
import java.util.Scanner;
public class EvenNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num=input.nextInt();
		System.out.println();
		int last,temp=num,rev=0,rev1;
		System.out.print("The Even numbers in "+num+" are: ");
		for(;num>0;num/=10)
		{
			last=num%10;
			rev=rev*10+last;
		}
		for(;rev>0;rev/=10)
		{
			rev1=rev%10;
			if(check(rev1))
			{
				System.out.print(rev1);
			}
			
		}
	}
	public static boolean check(int num)
	{
		if(num%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
