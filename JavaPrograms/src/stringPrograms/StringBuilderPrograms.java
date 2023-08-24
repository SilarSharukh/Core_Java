package stringPrograms;

public class StringBuilderPrograms {

	public static void main(String[] args) {
		StringBuilder s1= new StringBuilder("Core Java");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		System.out.println(s1);// over ridden
		// append
		s1.append(" Programming");
		System.out.println(s1);
		StringBuilder s2= new StringBuilder("Today is");
		StringBuilder s3= new StringBuilder(" Thusday.");
		s2.append(s3);
		System.out.println(s2);
		System.out.println(s3);
		s2.append(27);
		// insert = insert the data at any String Buffer we can even provide index
		s2.insert(19, 2023);
		s3.insert(0, 20685);
		System.out.println(s2);
		System.out.println(s3);
		// insert char[] in string buffer
		char c1[]= {'j','u','l','y'};
		s1.insert(21, c1);
		System.out.println(s1);
		//reverse 
		StringBuilder s4= new StringBuilder("Core Java");
		System.out.println(s4);
		s4.reverse();
		System.out.println(s4);
		// delete and delete char at
		StringBuilder s5= new StringBuilder("Java Progtramming");
		System.out.println(s5);
		s5.deleteCharAt(9);
		System.out.println(s5);
		s5.delete(0, 4);
		System.out.println(s5);
		// replace
		StringBuilder s6= new StringBuilder("This is Core Java class");
		System.out.println(s6);
		s6.replace(8, 12, "Advance");
		System.out.println(s6);
		// convert string buffer to string
		String s7= new String(s6);
		System.out.println(s7);
		//s7.reverse(); because string is imuttable.
		
	}

}
