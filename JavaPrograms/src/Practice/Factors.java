package Practice;
import java.util.Scanner;
public class Factors {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the number for which you want to find factors: ");
		int num=input.nextInt();
		System.out.println();
		System.out.print("The Factors of the number "+num+" are: ");
		for(int n=1;n<=num;n++)
		{
			if(num%n==0)
			{
				System.out.print(n+" ");
			}
		}	
	}

}
