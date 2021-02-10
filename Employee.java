package test;

public class Employee {
	 
	 String firstName;
	 String lastName;
  public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
  @Override
    public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
}
  
public static void main(String[] args) {
		 
    Employee  e1= new Employee("Harry"," Potter");
	System.out.println(e1);
	
	Employee  e2= new Employee("Ron"," Wisley");
	System.out.println(e2);
	
	Employee  e3= new Employee("Harmoinee"," Granger");
	System.out.println(e3);
	}

}
