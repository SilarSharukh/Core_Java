package objectClassProgram;
import java.util.Objects;
import java.util.Objects;

public class Circle {
int radius;

public Circle(int radius) {
	
	this.radius = radius;
}
@Override
public String toString()
{
	return "radius="+radius;
}
@Override
public boolean equals(Object o)
{
	Circle temp=(Circle)o;
	if(this.radius==temp.radius)
		return true;
	else
		return false;
}
@Override
public int hashCode()
{
	return Objects.hash(radius);
}

}
