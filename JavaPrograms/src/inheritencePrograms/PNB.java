package inheritencePrograms;

public class PNB extends Bank1{ 



public  float vehicle(float interestValue) 
{
	this.interestRate=interestValue;
	return interestRate;
}

public void display(float num)
{
	vehicle(num);
	System.out.println("Interest rate for PNB bank is "+interestRate);
}


}
