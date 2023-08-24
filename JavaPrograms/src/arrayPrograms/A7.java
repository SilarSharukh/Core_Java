package arrayPrograms;

public class A7 {
public static void main(String[] args) {
	int a[]= {10,45,6,78,9,5,4,75,956,5};
	int min=a[0],max=a[0];
	for(int ele:a)
	{
		if(ele>max)
			max=ele;
		if (ele<min)
			min=ele;
	}
	System.out.println(max);
	System.out.println(min);
}
}
