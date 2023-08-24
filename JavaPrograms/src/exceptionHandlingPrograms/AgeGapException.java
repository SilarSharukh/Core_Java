package exceptionHandlingPrograms;

public class AgeGapException extends RuntimeException{

	public AgeGapException(String msg)
	{
		System.out.println(msg);
	}
	
}
