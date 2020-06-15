/*Create a class called Person with a member variable name. Save it in a file called Person.java
Create a class called Employee that will inherit the Person class. The other data members of the Employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.Save this in a file called Employee.java
Your class should have the necessary constructors and getter/setter methods.

Write another class called TestEmployee, containing a main method to fully test your class definition.
Solution:

//Person.java
*/
class Person {
 private String name;
 Person(String name){
 	this.name=name;
 }
 void setName(String name){
 	this.name = name;
 }
 String getName(){
 	return name;
 }
}

//Employee.java
class Employee extends Person {
 private double annual_salary;
 private int emp_year;
 private String insurance_num;
 
 Employee(String name,double annual_salary,int emp_year,String insurance_num){
 	super(name);
 	this.annual_salary=annual_salary;
 	this.emp_year=emp_year;
 	this.insurance_num=insurance_num;
 }
 void setSalary(double annual_salary){
 	this.annual_salary=annual_salary;
 }
 void setYear(int emp_year){
 	this.emp_year=emp_year;
 }
 void setInsurance(String insurance_num){
 	this.insurance_num=insurance_num;
 }
 Double getSalary(){
 	return annual_salary;
 }
 int getYear(){
 	return emp_year;
 }
 String getInsurance(){
 	return insurance_num;
 }
}

//TestEmployee.java
class TestEmployee {

public static void main(String[] args) {
	Employee e = new Employee("AH",603434,2020,"abe3e3ede");
	System.out.print("Employee Name: "+e.getName()+"\nAnnual Salary: "+e.getSalary()+"\nYear of joining :"+e.getYear()+"\nInsurance Number :"+e.getInsurance());
}
}
