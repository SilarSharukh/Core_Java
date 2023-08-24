package stringPrograms;

public class StringMethods {
public static void main(String[] args) {
	String s1="Hello Good Afternoon.";
	String s2=new String("Today is tuesday.");
	String s3=s1;
	String s4="   This is afternoon class.    ";
	String s5="HELLO GOOD AFTERNOON";
	String s6="";
	String s7=" ";
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s1==s3);
	System.out.println(s1.equals(s4));
	System.out.println(s1.hashCode()==s3.hashCode());// state is compared and then create the unique integer number 
	System.out.println(s1.equals(s5));
	System.out.println(s1.length());
	System.out.println(s1.charAt(15));
	System.out.println(s1.equalsIgnoreCase(s5));
	System.out.println(s4.trim());
	System.out.println(s2.substring(9));// start exrtracting the string from that particular position.
	System.out.println(s2.substring(6,8));// prints the string between that position that is starting index and last index-1.
	System.out.println(s1.indexOf("H"));
	System.out.println(s2.indexOf("is"));
	System.out.println(s1.indexOf("o", 10));
	System.out.println(s1.lastIndexOf("o"));
	System.out.println(s1.lastIndexOf("n", 20));
	System.out.println(s5.toLowerCase());
	System.out.println(s2.startsWith("To"));
	System.out.println(s2.endsWith("y"));
	System.out.println(s4.contains("are"));
	System.out.println(s2.isBlank());
	System.out.println(s2.isEmpty());
	System.out.println(s6.isEmpty());
	System.out.println(s7.isBlank());
	System.out.println(s6.isBlank());
	System.out.println(s1.concat(s2));
	System.out.println(s2.concat(" We are having Core java class."));
	String s8="Java Programming";
	String s9=s8.replace('a', 'e');
	System.out.println(s8.replace('a', 'e'));
	System.out.println(s8.replaceAll("Java", "Core Java"));
	String s10=s1.replaceAll("[AEIOU,aeiou]", "*");
	System.out.println(s1.replaceAll("[AEIOU,aeiou]", "*"));
	String s11=s2.replaceAll("[A-Z]", "#");
	System.out.println(s11);
	String s12="I am a Java Developer.";
	String s13[]=s12.split(" ");
	for(String s:s13)
	{
		System.out.println(s);
	}
	String s14="JavaDevelopers";
	String[] s15=s14.split("");
	for(String s:s15) {
		System.out.println(s);
	}
	System.out.println();
	String s17="Core Java";
	char c1[]=s17.toCharArray();
	for(char c:c1) {
		System.out.println(c);
	}
	String s18="Apple";
	String s19="apple";
	int i=s18.compareTo(s19);
	System.out.println(i);// 
	
}
}
