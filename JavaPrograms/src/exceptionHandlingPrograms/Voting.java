package exceptionHandlingPrograms;

public class Voting extends RuntimeException{
	public Voting(String msg)
	{
		System.out.println(msg);
	}
}
