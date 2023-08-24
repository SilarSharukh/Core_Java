package stringPrograms;

public class StringBufferPrograms {

	public static void main(String[] args) {
		StringBuffer s1= new StringBuffer("Core Java");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		System.out.println(s1);// over ridden
		// append
		s1.append(" Programming");
		System.out.println(s1);
		StringBuffer s2= new StringBuffer("Today is");
		StringBuffer s3= new StringBuffer(" Thusday.");
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
		StringBuffer s4= new StringBuffer("Core Java");
		System.out.println(s4);
		s4.reverse();
		System.out.println(s4);
		// delete and delete char at
		StringBuffer s5= new StringBuffer("Java Progtramming");
		System.out.println(s5);
		s5.deleteCharAt(9);
		System.out.println(s5);
		s5.delete(0, 4);
		System.out.println(s5);
		// replace
		StringBuffer s6= new StringBuffer("This is Core Java class");
		System.out.println(s6);
		s6.replace(8, 12, "Advance");
		System.out.println(s6);
		// convert string buffer to string
		String s7= new String(s6);
		System.out.println(s7);
		//s7.reverse(); because string is imuttable.
		
		
		
	}

}
