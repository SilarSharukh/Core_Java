package inheritencePrograms;

public class Bike extends Vehical{
boolean start;

public Bike(int noOfWheels, boolean start) {
	super(noOfWheels);
	this.start = start;
}
void display()
{
	System.out.println("No of wheels in a Bike= "+this.noOfWheels);
	System.out.println("Is Bike is start? "+start);
}
}
