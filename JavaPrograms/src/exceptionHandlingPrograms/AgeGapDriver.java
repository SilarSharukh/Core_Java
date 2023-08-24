package exceptionHandlingPrograms;

import java.util.Scanner;

public class AgeGapDriver {
	public static void ageCheck(int age)
	{
		if(age>=10 && age<=17)
			throw new AgeGapException("You are a Kid.");
		else
			System.out.println("You are a Grown Up.");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter youe age: ");
		int age=sc.nextInt();
		ageCheck(age);
		System.out.println();

	}
}
