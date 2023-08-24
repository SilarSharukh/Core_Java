package objectClassProgram;

import java.util.Objects;

public class Laptop {
private float ram;
private float hardDisk;
private String processor;
public Laptop(float ram, float hardDisk, String processor) {

	this.ram = ram;
	this.hardDisk = hardDisk;
	this.processor = processor;
}
public float getRam()
{
	return ram;
	
}
public void setRam(float ram)
{
	this.ram=ram;
}
public float getHardDisk()
{
	return hardDisk;
	
}
public void setHardDisk(float hardDisk)
{
	this.hardDisk=hardDisk;
}
public String getProcessor()
{
	return processor;
	
}
public void setgProcessor(String processor)
{
	this.processor=processor;
}
@Override
public String toString()
{
	return "Ram is of "+ram+" GB, Hard Disk is of "+hardDisk+" GB and Processor is of "+processor+".";
	
}
@Override
public boolean equals(Object o)//up cating
{
	Laptop temp=(Laptop)o;//down casting
	/*if(this.ram==temp.ram || this.hardDisk==temp.hardDisk || this.processor==temp.processor)
		return true;
	else
		return false;*/
	return this.processor.equals(temp.processor);
}// this--> reference of b1 && temp--> seference of b2
@Override
public int hashCode()
{
	return Objects.hash(ram,hardDisk,processor);
}


}
