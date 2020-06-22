//Employee.java 
import java.io.*;
class Employee implements Serializable {
	private String name;
	private String dob;
	private String department;
	private String designation;
	private double salary;
	
void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setDob(String dob) {
		this.dob = dob;
	}

	String getDob() {
		return dob;
	}

	void setDepartment(String department) {
		this.department = department;
	}

	String getDepartment() {
		return department;
	}
	
	void setDesignation(String designation) {
		this.designation = designation;
	}

	String getDesignation() {
		return designation;
	}
	
	void setSalary(double salary) {
		this.salary = salary;
	}

	double getSalary() {
		return salary;
	}
}


//Serializing.java
import java.util.*;
import java.io.*;
class Serializing {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Scanner sc = new Scanner(System.in);
		Employee em = new Employee();
		System.out.print("Enter name- ");
		em.setName(sc.nextLine());
		System.out.print("Enter DOB- ");
		em.setDob(sc.nextLine());
		System.out.print("Enter department- ");
		em.setDepartment(sc.next());
		System.out.print("Enter designation- ");
		em.setDesignation(sc.next());
		System.out.print("Enter salary- ");
		em.setSalary(sc.nextDouble());
		sc.nextLine();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("OutObj.txt"));
		oos.writeObject(em);
		FileInputStream fis = new FileInputStream("OutObj.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e = (Employee) ois.readObject();
		System.out.println("Name- " + e.getName());
		System.out.println("DOB- " + e.getDob());
		System.out.println("Department- " + e.getDepartment());
		System.out.println("Designation- " + e.getDesignation());
		System.out.println("Salary- " + e.getSalary());
		ois.close();
		fis.close();
		oos.close();
		sc.close();

	}
}
