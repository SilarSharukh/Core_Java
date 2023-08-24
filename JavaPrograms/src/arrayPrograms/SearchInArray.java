package arrayPrograms;
import java.util.Scanner;
public class SearchInArray {
public static void main(String[] args) {
	

	int a[]= {2554,25,5,8,5,4,5,6,5,4,2,5,258};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int search=sc.nextInt();
	int k=0;
	for(int ele:a)
	{
		if(ele==search)
			k=1;
	}
	if (k==1)
		System.out.println(search+" is in the list.");
	else
		System.out.println(search+" is not in the list.");
	
}
}
