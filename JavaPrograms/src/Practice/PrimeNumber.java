package Practice;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number which you wanna find whether it is a prime number or not: ");
		int num=input.nextInt();
		boolean b=true;
		for(int n=2;n<=num/2;n++)
		{
			if(num%n==0)
			{
				b=false;
			}
		}
		System.out.println();
		if(b)
		{
			System.out.println(num+" is a Prime number");
		}
		else
		{
			System.out.println(num+" is Not a Prime number");
		}
		
	}

}
