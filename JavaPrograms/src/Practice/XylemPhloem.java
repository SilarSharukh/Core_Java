package Practice;
import java.util.Scanner;
public class XylemPhloem {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number for which you wanna find out whether it is a Xylem Number or Phloem Number: ");
		int num=input.nextInt();
		int last,sumOfMean=0,sumOfExtreme=0,temp=num;
		for(;num>0;num/=10)
		{
			if(num==temp || num<10)
			{
				last=num%10;
				sumOfExtreme+=last;
			}
			else
			{
				last=num%10;
				sumOfMean+=last;
			}
		}
		if(sumOfMean==sumOfExtreme)
		{
			System.out.println(temp+" is a Xylem Number.");
		}
		else
		{
			System.out.println(temp+" is a Phloem Number.");
		}
	}
}
