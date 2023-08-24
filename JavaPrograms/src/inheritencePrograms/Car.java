package inheritencePrograms;

public class Car extends Vehical{
boolean start;

public Car(int noOfWheels, boolean start) {
	super(noOfWheels);
	this.start = start;
}

void display()
{
	System.out.println("No of wheels in a car= "+this.noOfWheels);
	System.out.println("Is car is start? "+start);
}
}
