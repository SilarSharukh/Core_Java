package multiThreadingPrograms;

public class MyThread extends Thread{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

}
