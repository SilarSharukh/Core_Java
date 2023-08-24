package arrayPrograms;

public class A1 {
	public static void main(String[] args) {
		int []a =new int[4];
		a[0]=12;
		a[1]=22;
		a[2]=32;
		a[3]=42;
		//a[4]=25;java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		//System.out.println(a[0]);
		//System.out.println(a[1]);
		//System.out.println(a[2]);
		//System.out.println(a[3]);
		//System.out.println(a[4]);java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		System.out.println("The number of elements can be stored in Array is "+a.length);
		for(int ele:a)
		{
			System.out.println(ele);
		}
	}
}
