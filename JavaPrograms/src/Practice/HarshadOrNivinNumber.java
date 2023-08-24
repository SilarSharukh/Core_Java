package Practice;
import java.util.Scanner;
public class HarshadOrNivinNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the which you wanna verify whether it is a Harshas Number or Not: ");
		int n=input.nextInt();
	
		System.out.println();
		
	
		
		int temp=n,sum=0,fact;
		for(;n>0;n/=10)
		{
			fact=n%10;
			sum+=fact;
		}
		if (temp%sum==0)
		{
			System.out.println(temp+" ");
		}
		else
		{
			System.out.println(temp+" is Not a Harshad Number.");
		}
		
	}
}
