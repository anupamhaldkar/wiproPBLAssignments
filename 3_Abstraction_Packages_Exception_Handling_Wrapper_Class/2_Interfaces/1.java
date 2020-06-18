/*Write an interface called Playable, with a method
void play();
Let this interface be placed in a package called music .Write a class called Veena which implements Playable interface. Let this class be placed in a package music.string . Write a class called Saxophone which implements Playable interface. Let this class be placed in a package music.wind .Write another class Test in a package called live. Then,
a. Create an instance of Veena and call play() method
b. Create an instance of Saxophone and call play() method
c. Place the above instances in a variable of type Playable and then call play()
Solution:
*/
//playable.java
package music;
public interface Playable {
	void play();
}

//Veena.java
package music.string;
import music.Playable;
public class Veena implements Playable {
@Override
	public void play() {
		System.out.println("Veena");
	}
}

//Saxophone.java
package music.wind;
import music.Playable;
public class Saxophone implements Playable{	
@Override
	public void play() {
		System.out.println("Saxophone");
	}
}

//Test.java
package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class Test {
public static void main(String[] args) {
		Playable veena = new Veena();
		veena.play();
		Playable saxophone = new Saxophone();
		saxophone.play();
	}
}
