package multiThreadingPrograms;

public class MyThreadDriver {

	public static void main(String[] args) {
		MyThread obj=new MyThread();
		obj.start();
		obj.setName("Number Printing 1 to 10");
		System.out.println(obj.getName());
		System.out.println(obj.getId());
		obj.setPriority(8);
		System.out.println(obj.getPriority());
		System.out.println(obj.getClass());
		System.out.println(obj.getState());
		System.out.println(obj.getThreadGroup());
	}

}
