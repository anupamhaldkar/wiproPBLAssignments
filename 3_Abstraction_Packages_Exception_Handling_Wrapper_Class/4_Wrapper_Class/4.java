/* Create an employee class with properties of your choice. Create an object of this class and also create a clone of the same. After making the clone, change the properties of the original employee object and print the properties of both the original and clone object and note down your observation.
Solution:
*/
class EmployeeCloning implements Cloneable{
	String name;
	String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	
	  EmployeeCloning cloning() {
		try {
			return (EmployeeCloning) super.clone();	
		}
		catch(CloneNotSupportedException e) {
			System.out.println("Cloning not Allowed.");
			return this;
		}
	}
	public static void main(String [] args) {
		EmployeeCloning  emp = new EmployeeCloning();
		emp.setName("AH");
		EmployeeCloning clone = emp.cloning();
		
		System.out.println("Before changes \n Existing Object-"+emp.getName()+", Cloning Object-"+clone.getName());
		
		
		clone.setName("MS");
		
		System.out.println("After changes \n Existing Object-"+emp.getName()+", Cloning Object-"+clone.getName());
		
		
	}
	
}
