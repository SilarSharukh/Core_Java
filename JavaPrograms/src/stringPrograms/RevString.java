package stringPrograms;

public class RevString {
public static void main(String[] args) {
	String s1="Core Java";
	String s2="";
	System.out.println("Original String is : "+s1);
	for(int n=s1.length()-1;n>=0;n--) //9-1>=0T 8>=0T
	{
		s2=s2+s1.charAt(n);//a+""=a  a+v=av
	}
	System.out.println("The reverse String is : "+s2);
}
}
