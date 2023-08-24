package stringPrograms;

public class PalindromString {

	public static void main(String[] args) {
		String s1="Madam";
		String s2="";
		System.out.println("Origina String is : "+s1);
		for(int n=s1.length()-1;n>=0;n--) //9-1>=0T 8>=0T
		{
			s2=s2+s1.charAt(n);//a+""=a  a+v=av
		}
		System.out.println("The reverse String is : "+s2);
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Palindrom String");
		else
			System.out.println("Not Palindrom String");
	}

}
