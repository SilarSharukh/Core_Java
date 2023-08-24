package Practice;
import java.util.Scanner;
public class SpyNumber {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number which you wanna verify whether it is a Spy Number or not: ");
	int num=input.nextInt();
	System.out.println();
	int sum=0,product=1,last,temp=num;
	for(;num>0;num/=10)
	{
		last=num%10;
		sum+=last;
		product*=last;
	}
	if(sum==product)
	{
		System.out.println(temp+" is a SPY numvber.");
	}
	else
	{
		System.out.println(temp+" is Not a SPY numvber.");
	}
}
}
