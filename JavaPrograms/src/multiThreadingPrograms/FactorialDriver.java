package multiThreadingPrograms;

public class FactorialDriver {

	public static void main(String[] args) {
		Factorial obj=new Factorial(5);
		obj.setName("Factorial Thread");
		obj.start();

	}

}
