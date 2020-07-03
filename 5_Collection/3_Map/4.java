import java.util.*;

public class Contact {
	HashMap<String, Integer> contacts = new HashMap<>();
	
	public void addContact(String name, Integer number) {
		contacts.put(name, number);
	}
	
	public void removeContact(String name) {
		contacts.remove(name);
	}

	@Override
	public String toString() {
		return "Contacts=" + contacts ;
	}
	
	public boolean nameExist(String name) {
		Set<Map.Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Map.Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			if (me.getKey().equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean numberExist(Integer number) {
		Set<Map.Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Map.Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			if (me.getValue().intValue() == number) {
				return true;
			}
		}
		
		return false;
	}
	
	public void listContacts() {
		Set<Map.Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Map.Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			System.out.println(me);
		}

	}
	public static void main(String[] args) {
		Contact list = new Contact();
		
		list.addContact("Amit Singh", 354565);
		list.addContact("Police Inspector", 100);
		list.addContact("Advocate Manager", 323154);
				
		System.out.println("Police: " + list.nameExist("Police"));
		System.out.println("323154: " + list.numberExist(323154)+"\n");
		
		list.listContacts();
	}
}

