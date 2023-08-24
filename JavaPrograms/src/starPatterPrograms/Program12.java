package starPatterPrograms;

public class Program12 {
	public static void main(String[] args) {
		for (int m=1;m<=5;m++)
		{
			for (int n=5;n>=1;n--)
			{
				if (m>=n || n==1)
				{
					System.out.print("* ");//    1
											//   2 1
											//  3 2 1 
											// 4 3 2 1 
											//5 4 3 2 1
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
	/*			  * 
	 			 * * 
	 			* * * 
	 		   * * * * 
	 		  * * * * * 
	 */
