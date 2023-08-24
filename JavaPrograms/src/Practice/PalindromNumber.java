package Practice;
import java.util.Scanner;
public class PalindromNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number for which you wanna find out whether it is a palindrom number or not: ");
		int num=input.nextInt();
		int rev=0,temp=num,last;
		for (;num>0;num/=10)
		{
			last=num%10;
			rev=rev*10+last;
		}
		if(rev==temp)
		{
			System.out.println(temp+" is a Palindrom number.");
		}
		else
		{
			System.out.println(temp+" is Not a Palindrom number.");
		}
	}
}
