package Practice;
import java.util.Scanner;
public class StrongNumber {
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the number for which you wanna find out whether it is a Strong number or not: ");
			int num=input.nextInt();
			int fact,temp=num,sum=0,last;
			for(;num>0;num/=10)
			{
				last=num%10;
				fact=fact(last);
				sum+=fact;
			}
			if(sum==temp)
			{
				System.out.println(temp+" is a Strong Number.");
			}
			else
			{
				System.out.println(temp+" is Not a Strong Number.");
			}
		}
		public static int fact(int num)
		{
			int product=1;
			for(int n=num;n>0;n--)
			{
				product*=n;
			}
			return product;
		}

}
