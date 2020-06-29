import java.util.*;

class Employee {
	 int id;
	 String name;
	 String address;
	 Double salary;
	
	Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary;
	}
}

public class EmplyeeD {

	public static void main(String[] args) {
		Vector<Employee> list = new Vector<>();
		
		list.add(new Employee(401, "Amey", "123 M A colony, India", 70500.0));
		list.add(new Employee(402, "Kittu", "234 park street, India", 2459.0));
		list.add(new Employee(403, "Shashwat", "345 JT nagar, India", 5542.0));
		list.add(new Employee(404, "Shantanu", "456 Centre delhi, India", 32324.0));
		
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
		

	}

}
