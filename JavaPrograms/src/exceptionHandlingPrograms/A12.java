package exceptionHandlingPrograms;
//throws with checked exception.
public class A12 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Go to Sleep");
		Thread.sleep(2000);//InterruptedException
		System.out.println("Awake");
		
	}

}
