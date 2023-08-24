package Practice;
import java.util.Scanner;
public class NeonNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Number for which you wanna verify whether it is Neon Number or Not: ");
		int num=input.nextInt();
		System.out.println();
		int square,sum=0;
		square=num*num;
		for(;square>0;square/=10)
		{
			int temp=square%10;
			sum+=temp;
		}
		if(sum==num)
		{
			System.out.println(num+" is a Neon Number.");
		}
		else
		{
			System.out.println(num+" is Not a Neon Number.");
		}
	}
}
