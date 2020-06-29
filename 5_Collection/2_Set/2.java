import java.util.*;

public class EmployeeName {

	public static void main(String[] args) {
		HashSet<String> emp = new HashSet<>();
		
		emp.add("AH");
		emp.add("AS");
		emp.add("MS");
		emp.add("Peter parker");
		
		Iterator<String> it = emp.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}
