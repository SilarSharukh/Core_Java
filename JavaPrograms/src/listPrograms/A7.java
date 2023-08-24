package listPrograms;
import java.util.Stack;
public class A7 {

	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.push("Hello");
		s1.push(10);
		s1.push(10.1f);
		s1.push(2564.02);
		s1.push(true);
		s1.push(2546546464l);
		s1.push('H');
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1);
		

	}

}
