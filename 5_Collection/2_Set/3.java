import java.util.*;

public class TreeDemo {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();
		tree.add("AH");
		tree.add("AMS");
		tree.add("AS");
		tree.add("MS");
		TreeSet<String> trees = (TreeSet<String>)tree.descendingSet();
			System.out.println(trees);
		Iterator<String> it = tree.iterator();
		String check = "Ams";
		
		boolean res = false;
		
		while (it.hasNext()) {
			if (it.next().equalsIgnoreCase(check)) {
				res = true;
				break;
			}
		}
		
		if (res)
		 System.out.println(check + " is present");
		else 
			System.out.println(check + " is absent");

	}
}
