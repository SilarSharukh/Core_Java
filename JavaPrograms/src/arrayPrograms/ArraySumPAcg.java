package arrayPrograms;
import java.util.Scanner;
public class ArraySumPAcg {
public static Scanner sc=new Scanner(System.in);
public static int size()
{
	System.out.println("Enter the siz: ");
	return sc.nextInt();
}
public static int[] creatArray(int size) {
	return new int[size];
}
public static void read(int []a) {
	System.out.println("Enter the elements");
	for(int n=0;n<a.length;n++) {
		a[n]=sc.nextInt();
	}
}
public static int sum(int a[])
{
	int sum=0;
	for (int ele:a)
	{
		sum+=ele;
	}
	return sum;
}
public static double avg(double sum,double size)
{
	return sum/size;
}
public static void main(String[] args) {
	int size=size();
	int a[]=creatArray(size);
	read(a);
	int sum=sum(a);
	double avg=avg(sum,a.length);
	System.out.println(sum);
	System.out.println(avg);
}
}

