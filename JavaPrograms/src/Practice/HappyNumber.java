package Practice;
import java.util.Scanner;
public class HappyNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number for which you wanna find out whether it is a Happy number or not: ");
		int num=input.nextInt();
		int temp=num;
		while(num!=1 && num!=4)
		{
			num=happy(num);
		}
		if(num==1)
		{
			System.out.println(temp+" is a Happy Number.");
		}
		else
		{
			System.out.println(temp+" is Not a Happy Number.");
		}
	}
	public static int happy(int num)
	{
		int sum=0,product,last;
		for(;num>0;num/=10)
		{
			last=num%10;
			product=last*last;
			sum+=product;
		}
		return sum;
	}
}
