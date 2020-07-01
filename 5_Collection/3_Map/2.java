import java.util.*;

public class Capable {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("India", "Delhi");
		map.put("USA", "Washington");
		map.put("Srilanka", "Colombo");
		Set<Map.Entry<String, String>> set = map.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			if (me.getKey().equalsIgnoreCase("USA")) {
				System.out.println("USA exist");
				break;
			}
		}
		
		 it= set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			if (me.getValue().equalsIgnoreCase("Delhi")) {
				System.out.println("Delhi exist");
				break;
			}
		}
		it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			System.out.println(me);
			
		}
	}

}
