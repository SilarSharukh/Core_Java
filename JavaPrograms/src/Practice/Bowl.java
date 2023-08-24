package Practice;
import java.util.Scanner;
public class Bowl {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the Bowl number: ");
	int n=input.nextInt();
	System.out.println();
	int n1=0,n2=1,n3=0;
	for(int count=1;count<=n-2;count++)
	{
		n3=n1+n2;
		n1=n2;
		n2=n3;
	}
	System.out.println("The "+n+"th Bowls consist "+n3+" chocolates");
}
}
