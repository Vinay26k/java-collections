import java.lang.Iterable;
import java.util.List; // for datastructure to store values
import java.util.Iterator; // for iterator object
import java.util.ArrayList;

class Employee{
	private String name;
	private Integer age;
	public Employee(String name, Integer age){
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(Integer age){
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public Integer getAge(){
		return this.age;
	}
}

class IterableDepartment implements Iterable<Employee>{
	List<Employee> employeeList;
	public IterableDepartment(List<Employee> employeeList){
		this.employeeList = employeeList;
	}
	// we need to implement iterator
	@Override
	public Iterator<Employee> iterator(){
		return employeeList.iterator();
	}
}

public class IterableDemo{
	/* code by Vinay26k */
	public static void main(String [] args){
		System.out.println("Code by github: Vinay26k");
		List <Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("ABC",45));
		employeeList.add(new Employee("BCD",42));
		employeeList.add(new Employee("CDE",65));
		employeeList.add(new Employee("DEF",22));
		employeeList.add(new Employee("EFG",29));

		IterableDepartment itDepartment = new IterableDepartment(employeeList);
		/*for(Employee emp : itDepartment){
			System.out.println(emp.getName());
		}*/
		// forEach implemented
		itDepartment.forEach(x -> System.out.println(x.getName()));
	}
}