package polymorphismPrograms;

public class MethodOverLoading {
public static void main(String[] args) 
{
	MethodOverLoading obj= new MethodOverLoading();
	obj.sum();
	System.out.println(obj.sum(56,20));
	System.out.println(obj.sum(56.6f,20.0f));
	System.out.println(obj.sum(56.666,20.5555));
	System.out.println(obj.sum('A','b'));
	System.out.println(obj.sum1());
}
public  int sum(int a, int b)
{
	return a+b;
}
public float sum(float a, float b)
{
	return a+b;
}
public  double sum(double a, double b)
{
	return a+b;
}
public  char sum(char a, char b)
{
	return (char)(a+b);
}
public  void sum()
{
	return;
}
public int sum1()
{
	if (23<30)
	{
		return 23;
	}
	else
	{
		return 30;
	}
} 

}
