/*Create a class Box that uses a parameterized constructor to initialize the dimensions of a box. The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities.
Solution :
*/
import java.io.*;
import java.util.*;

class Box {
	private double width;
	private double height;
	private double depth;
	Box(double width,double height,double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}

	double getVolume(){
		return width*height*depth;
	}
}
class MainBox{
	public static void main (String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		double depth = sc.nextDouble();
		Box b = new Box(width,height,depth);
		System.out.println(b.getVolume());
	}
}
