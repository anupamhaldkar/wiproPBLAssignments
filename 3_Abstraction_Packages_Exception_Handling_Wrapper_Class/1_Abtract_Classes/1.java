/* Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class. 
public abstract String notice();
Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice message that is suitable to the specific type of  compartment.Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.Check the polymorphic behavior of the notice method.[i.e based on the random  number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]
Solution:
*/
import java.util.*;
abstract class Compartment {
	public abstract String notice();
}

class FirstClass extends Compartment{

	@Override
	public String notice() {
		return "FirstClass";
	}
	
}

class Ladies extends Compartment{

	@Override
	public String notice() {
		return "Ladies";
	}
	
}

class General extends Compartment{

	@Override
	public String notice() {
		return "General";
	}
	
}

class Luggage extends Compartment{

	@Override
	public String notice() {
		return "Luggage";
	}
	
}

class TestCompartment {
	public static void main(String args[]) {
		Compartment[] compartment = new Compartment[10];
		Random rand = new Random();
		for(int i=0;i<10;i++) {
			int num = rand.nextInt(4)+1;
			if(num==1)
				compartment[i]=new FirstClass();
			else if(num==2)
				compartment[i]=new Ladies();
			else if(num==3)
				compartment[i]=new General();
			else if(num==4)
				compartment[i]=new Luggage();
			System.out.println(compartment[i].notice());
		}
	}
}
