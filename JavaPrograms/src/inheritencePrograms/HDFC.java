package inheritencePrograms;

public class HDFC extends Bank1 {

 public  float vehicle(float interestValue) 
 {
	 interestRate=interestValue;
 	return interestRate;
 }

 public void display(float num)
 {
 	vehicle(num);
	System.out.println("Interest rate for HDFC bank is "+interestRate);
}
}
