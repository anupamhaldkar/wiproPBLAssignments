import java.util.*;

public class PropertyObject {

	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("MP", "Bhopal");
		properties.setProperty("MH", "Mumbai");
		properties.setProperty("UP", "Lucknow");

		Set set = properties.entrySet();
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			Object me = it.next();
			System.out.println(me);
		}
	}

}

