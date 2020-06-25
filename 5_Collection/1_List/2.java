import java.util.*;
import java.io.*;

class Employee {
	private int EmpId; 
	private String EmpName;
	private String EmpEmail; 
	private char EmpGender;
	private float EmpSalary;
	
	public Employee() {}

	public Employee(int empId, String empName, String empEmail, char empGender, float empSalary) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpEmail = empEmail;
		EmpGender = empGender;
		EmpSalary = empSalary;
	}

	public String GetEmployeeDetails() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpEmail=" + EmpEmail 
				+ ", EmpGender=" + EmpGender + ", EmpSalary=" + EmpSalary + "]";
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpEmail() {
		return EmpEmail;
	}

	public void setEmpEmail(String empEmail) {
		EmpEmail = empEmail;
	}

	public char getEmpGender() {
		return EmpGender;
	}

	public void setEmpGender(char empGender) {
		EmpGender = empGender;
	}

	public float getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(float empSalary) {
		EmpSalary = empSalary;
	}
	
	
}
class EmployeeDB {
	List<Employee> employeeDb = new ArrayList<>();
	
	public boolean addEmployee(Employee e) {
		return employeeDb.add(e);
	}
	
	public boolean deleteEmployee(int empId) {
		boolean isRemoved = false;
		
		Iterator<Employee> it = employeeDb.iterator();
		
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getEmpId() == empId) {
				isRemoved = true;
				it.remove();
			}
		}
		
		return isRemoved;
	}
	
	public String showPaySlip(int empId) {
		String paySlip = "Invalid employee id";
		
		for (Employee e : employeeDb) {
			if (e.getEmpId() == empId) {
				paySlip = "Pay slip for employee id " + empId + " is " +
						e.getEmpSalary();
			}
		}

		return paySlip;
	}
	
	public Employee[] listAll() {
		Employee[] empArray = new Employee[employeeDb.size()];
		for (int i = 0; i < employeeDb.size(); i++)
			empArray[i] = employeeDb.get(i);
		return empArray;
	}
	
}

public class Main {

	public static void main(String[] args) {
		EmployeeDB empDb = new EmployeeDB();
		
		Employee emp1 = new Employee(101, "John", "high@soft.com", 'M', 25040);
		Employee emp2 = new Employee(102, "Mark", "Marky@temp.com", 'F', 23000);
		Employee emp3 = new Employee(103, "Alex", "jfjeifk@gmail.com", 'M', 24000);
		Employee emp4 = new Employee(104, "Ambrose", "fvfv@outlook.com", 'M', 43220);
		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);

		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		empDb.deleteEmployee(102);
		
		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(103));
	}

}
