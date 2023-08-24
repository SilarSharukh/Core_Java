package inheritencePrograms;
import java.util.Scanner;
public class Bank1Driver {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Interest Rate for HDFC Bank: ");
		float hdfc=input.nextFloat();
		System.out.println();
		System.out.print("Enter the Interest Rate for PNB Bank: ");
		float pnb=input.nextFloat();
		System.out.println();
		HDFC b1=new HDFC();
		b1.display(hdfc);
		
		PNB b2=new PNB();
		b2.display(pnb);
	}

}

