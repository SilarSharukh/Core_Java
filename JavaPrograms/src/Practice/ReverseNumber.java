package Practice;
import java.util.Scanner;
public class ReverseNumber {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the numberwhich you wanna reverse: ");
	int num=input.nextInt();
	System.out.println();
	int temp=num,sum=0,rev;
	for (;temp>0;temp/=10)
	{
		rev=temp%10;
		sum=sum*10+rev;
		
	}
	System.out.println("Rverse of "+num+" is equal to "+sum);
}
}