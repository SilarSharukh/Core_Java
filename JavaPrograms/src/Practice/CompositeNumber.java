package Practice;
import java.util.Scanner;
public class CompositeNumber {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the range: ");
	int num1=input.nextInt();
	int num2=input.nextInt();
	System.out.print("The Composite numbers between "+num1+" and "+num2+" are: ");
	for(int n=num1;n<=num2;n++)
	{
		boolean b=true;
		for (int n1=2;n1<=n/2;n1++)
		{
			if(n%n1==0)
			{
				b=false;
			}
		}
		if(!b)
		{
			System.out.print(n+" ");
		}
	}

}
}
