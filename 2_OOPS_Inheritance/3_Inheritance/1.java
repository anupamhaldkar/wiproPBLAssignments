/*Create a class named ‘Animal’ which includes methods like eat() and sleep().
Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().
Create an instance of Animal class and invoke the eat and sleep methods using this object.
Create an instance of Bird class and invoke the eat, sleep and fly methods using Create a class named ‘Animal’ which includes methods like eat() and sleep().

Solution:
*/
import java.util.*;
class Animal {
	void eat(){
		System.out.println(" Animal eat");
	}
	void sleep(){
		System.out.println(" Animal Sleep");
	}
}

class Bird extends Animal {
	
	@Override
	void eat(){
		System.out.println(" Bird Eat");
	}

	@Override
	void sleep(){
		System.out.println(" Bird Sleep");
	}
	void fly(){
		System.out.println(" Bird fly");
	}

}
class AnimalBird{
public static void main(String[] args) {
	Animal b = new Animal();
	b.eat();
	b.sleep();
	Bird a = new Bird();
	a.eat();
	a.fly();
	a.sleep();
}
}
