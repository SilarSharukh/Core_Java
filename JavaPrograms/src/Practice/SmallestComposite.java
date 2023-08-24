package Practice;
import java.util.Scanner;
public class SmallestComposite {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.print("Enter the number which you wanna find whether it is a prime number or not: ");
	int num=input.nextInt();
	boolean b=true;
	for(int i=num;i>0;i++)
	{
	for(int n=2;n<=i/2;n++)
	{
		if(i%n==0)
		{
			b=false;
		}
	}
	System.out.println();
	if(!b)
	{
		System.out.print(num);
		break;
	}
	break;
	}
}
}
