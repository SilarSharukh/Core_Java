package Practice;
import java.util.Scanner;
public class ManuProgram {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the Serial number \n 1.To Find whether the number is Spy number. \n 2.To Find whether the number is Neon number. \n 3. To Find whether the number is Nivin number.");
	int choice=input.nextInt();
	switch (choice)
	{
	case 1:{
		System.out.println("You have Selected to check the whether the number is Spy or not.");
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the number which you wanna verify whether it is a Spy Number or not: ");
		int num=obj.nextInt();
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
	break;
	case 2:{
		System.out.println("You have Selected to check the whether the number is Neon or not.");
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the Number for which you wanna verify whether it is Neon Number or Not: ");
		int num=obj.nextInt();
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
	break;
	
	case 3:{
		System.out.println("You have Selected to check the whether the number is Nivin or not.");
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the which you wanna verify whether it is a Harshas Number or Not: ");
		int n=obj.nextInt();
	
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
	break;
	}
		
}
}
