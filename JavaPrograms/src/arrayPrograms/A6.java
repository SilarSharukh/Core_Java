package arrayPrograms;

public class A6 {
public static void main(String[] args) {
	int a[]= {12,-25,15,758,96,45,78,23,-556,78,41};
	// count even numbers
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
			count++;
	}
	System.out.println("Total no of Even numbers are: "+count);
	// count odd numbers
		int count1=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				count1++;
		}
		System.out.println("Total no of Odd numbers are: "+count1);
	// count Positive numbers
		int count2=0,count3=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
				count2++;
			else
				count3++;
		}
		System.out.println("Total no of Positive numbers are: "+count2);
		System.out.println("Total no of negative numbers are: "+count3);
	// count 2 digits numbers
		int count4=0,count5=0;
		for(int i=0;i<a.length;i++)
			{
				if(a[i]>9 && a[i]<100)
					count4++;
				else
					count5++;
			}
		System.out.println("Total no of two digit numbers are: "+count4);
		System.out.println("Total no of numbers which are not two digit number: "+count5);
// count numbers ends with 8
		int count6=0,count7=0;
		for(int i=0;i<a.length;i++)
			{
				if(a[i]%10==8)
					count6++;
				else
					count7++;
			}
		System.out.println("Total no of numbers ending with '8' are: "+count6);
		System.out.println("Total no of numbers not ending with '8'are: "+count7);
						
	
			
}
}
