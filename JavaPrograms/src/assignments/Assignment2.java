package assignments;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1=sc.nextLine();
		System.out.print("The Code is: ");
		for(int n=0;n<s1.length()-1;n++)
		{
			if(s1.charAt(n)!='$' && (n==0 || s1.charAt(n-1)=='$' )){
				System.out.print(s1.charAt(n)+" ");
			}
		}

	}

}
