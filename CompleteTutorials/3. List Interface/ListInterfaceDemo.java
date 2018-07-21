import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;

// I just want to make explanation more in depth, let's create user defined type list
class EmployeeDetails implements Comparable<EmployeeDetails>{
	private Integer id;
	private String name;
	private Double salary;
	public EmployeeDetails(Integer id, String name, Double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void setId(Integer id){this.id = id;}
	public void setName(String name){this.name = name;}
	public void setSalary(Double salary){this.salary = salary;}

	public Integer getId(){return this.id;}
	public String getName(){return this.name;}
	public Double getSalary(){return this.salary;}
	@Override
	public String toString(){
		return "Employee Id: "+this.id+" "+this.name+" "+Math.round(this.salary*100.0)/100.0;
	}
	//name Comparator - sorty by names
	public static final Comparator<EmployeeDetails> nameComparator = new Comparator<>(){
		@Override
		public int compare(EmployeeDetails o1, EmployeeDetails o2){
			return o1.getName().compareTo(o2.getName());
			//coz String have inbuilt compareto methods
		}
	};

	//salary Comparator - sort by Salaries
	public static final Comparator<EmployeeDetails> salaryComparator = new Comparator<>(){
		@Override
		public int compare(EmployeeDetails o1, EmployeeDetails o2){
			return (int)((o1.getSalary())- (o2.getSalary()));
		}
	};

	// coz we are implementing comparable, we must override default compareTo
	@Override
	public int compareTo(EmployeeDetails o){
		return this.id - o.getId();
	}

}



class ListInterfaceExample{
	public static void someMethod(){
		List<EmployeeDetails> emp = new ArrayList<EmployeeDetails>();
			emp.add(new EmployeeDetails(1,"CDE",8756.0));
			emp.add(new EmployeeDetails(25,"BCD",4566.2356));
			emp.add(new EmployeeDetails(36,"ABC",9000.0));
			emp.add(new EmployeeDetails(14,"DEF",(double)10000));
			emp.add(new EmployeeDetails(5,"ZXY",(double)4000));
		//size
		System.out.println("Size of employee list : "+emp.size());

		/*for(EmployeeDetails em : emp){
			System.out.println(em.getName());
		}*/
		//display
		emp.forEach(em -> System.out.println(em));
		List<EmployeeDetails> emp2 = new ArrayList<>(){{
			add(new EmployeeDetails(12,"DFG",456.02));
			add(new EmployeeDetails(84,"HHI",5000.0));
			add(new EmployeeDetails(16,"ACD",4563.0));
			add(new EmployeeDetails(9,"SDF",4000.0));
		}};
		//addAll(index,collection)
		emp.addAll(emp2);
		emp.forEach(System.out::println);
		// replace all emp2 salaries in emp with 11% increment
		emp.replaceAll(employee -> { 
			if(emp2.contains(employee))
				employee.setSalary(employee.getSalary()+employee.getSalary()*0.11); 
				return employee;
		});
		emp.forEach(System.out::println);
		//sort using ids
		Collections.sort(emp);
		System.out.println("After Sorting with IDs [default compareTo]");
		emp.forEach(System.out::println);
		//sort using name
		Collections.sort(emp, EmployeeDetails.nameComparator);
		System.out.println("After Sorting with names [using nameComparator]");
		emp.forEach(System.out::println);
		//sort using salary
		Collections.sort(emp, EmployeeDetails.salaryComparator);
		System.out.println("After sorting based on Salaries [using salaryComparator]");
		emp.forEach(System.out::println);
		// get()
		System.out.println("Element at index 5: "+emp.get(5));
		//set()
		emp.set(5,new EmployeeDetails(emp.get(5).getId(),"HHIH",emp.get(5).getSalary()));
		System.out.println("ELement at index 5: "+emp.get(5));
		//add(index, ele)
		emp.add(5, new EmployeeDetails(22,"Added",5560.02));
		System.out.println("ELement at index 5: "+emp.get(5));
		System.out.println("Now the size of list: "+ emp.size());
		//indexOf
		System.out.println(emp.indexOf(emp.get(5)));
		// remove(Object) from Collection interface
		// remember we have pass object as remove(new Integer.valueOf(1))
		emp.remove(emp.get(5));
		emp.forEach(System.out::println);
		System.out.println("ELement at index 5: "+emp.get(5));
		//remove(index)
		emp.remove(5);
		System.out.println("ELement at index 5: "+emp.get(5));
		System.out.println("Now the size of list: "+ emp.size());
		//subList(startIndex, endIndex)
		List <EmployeeDetails> temp = emp.subList(2,5);
		temp.forEach(System.out::println);
		System.out.println("Now the size of list: "+ emp.size());
		//of()
		List <String> temp1 = List.of("hello","world","this","is","of","method");
		temp1.forEach(w->System.out.print(w+" "));
		System.out.println("\n"+temp.size());

		temp.size();
		temp = List.copyOf(emp);
		temp.forEach(System.out::println);

		//temp1.add("can't add coz its unmodifiable");
	}
}

public class ListInterfaceDemo{
	/* code by Vinay26k */
	public static void main(String [] args){
		System.out.println("Code by github: Vinay26k");
		ListInterfaceExample lie = new ListInterfaceExample();
		lie.someMethod();
	}
}