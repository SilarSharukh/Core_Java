package inheritencePrograms;

public class BankDriver {
public static void main(String[] args) {
	Sbi s=new Sbi("SBI","MAIN BRANCH","SBI00002136","Mr.Shashak");
	s.display();
	System.out.println("*****************************************************");
	Icici i=new Icici("ICICI","MAIN BRANCH","ICICI00009636","Mr.Subash");
	s.display();
}
}
