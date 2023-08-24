package Practice;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number for which you wanna find out whether it is a Perfect number or not: ");
		int num=input.nextInt();
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
		}
		else
		{
			System.out.println(temp+" is Not a Perfect Number.");
		}
	}
}
