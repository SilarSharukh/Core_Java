package Practice;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number for which you wanna find out whether it is a Armstrong number or not: ");
		int num=input.nextInt();
		int last,sum=0,temp=num,count=0;
		for(;temp>0;temp/=10)
		{
			count++;
		}
		temp=num;
		for (;temp>0;temp/=10)
		{
			last=temp%10;
			sum+=Math.pow(last, count);
		}
		if(sum==num)
		{
			System.out.println(num+" is a Armstrong Number.");
		}
		else
		{
			System.out.println(num+" is Not a Armstrong Number.");
		}
		
	}
}
