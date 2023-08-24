package starPatterPrograms;

public class Program13 {

	public static void main(String[] args) {
		for (int m=1;m<=5;m++)
		{
			for (int n=5;n>=1;n--)
			{
				if (m>=n || n==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
