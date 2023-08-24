package exceptionHandlingPrograms;

import java.util.Scanner;

public class A15 {

	public static void ageCheck(int age)
	{
		if(age<18)
			throw new Voting("Not eligible to cast a vote");
		else
			System.out.println("Eligible to cast a vote.");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter youe age: ");
		int age=sc.nextInt();
		ageCheck(age);
		System.out.println();

	}

}
