import java.util.*;
public class PrintS {
public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Item-1");
		list.add("Item-2");
		list.add("Item-3");
		list.add("Item-4");
		printAll(list);
	}

	 static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}
}


