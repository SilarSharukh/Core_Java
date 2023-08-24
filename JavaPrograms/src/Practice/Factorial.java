package Practice;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number for which you wanna find out Factorial: ");
		int num=input.nextInt();
		int fact=1;
		for(int n=num;n>0;n--)
		{
			fact*=n;
		}
		System.out.println("The Factorial of "+num+" is : "+fact);
	}
}
