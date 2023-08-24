package Practice;

public class Project1Driver {

	public static void main(String[] args) {
		
		int size=Project1.size();
		int []arr=Project1.createArray(size);
		Project1.read(arr);
		System.out.println("22511");
		int sum=Project1.sum(arr);
		double avg=Project1.avg(sum, size);
		System.out.println("Sum of the Array= "+sum);
		System.out.println("Average of the Array= "+avg);
		
		
		
		
		

	}

}
