/*Create  a base class Fruit with name ,taste and size as its attributes. 

Create a method called eat() which describes the name of the fruit and its taste. 

Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.

Solution:
*/ 
class Fruit {
	private String name;
	private String taste;
	private int size;
	
	Fruit() {
		name = "Fruit name";
		taste = "Taste of fruit";
		size = 0;
	}
	
	void eat () {
		System.out.println(taste);
	}

}
class Apple extends Fruit {
	@Override
	void eat() {
		System.out.println("Taste of apple");
	}
}

class Orange extends Fruit {
	@Override
	void eat() {
		System.out.println("Taste of Orange");
	}
}

class MainFruit {
	public static void main(String[] args) {
		Fruit f=new Fruit();
		f.eat();
		new Apple().eat();
		new Orange().eat();

	}
}
