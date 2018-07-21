import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student>{
	private Integer id;
	private String name;
	public Student(Integer id, String name){
		this.id = id;
		this.name = name;
	}
	public Integer getId(){return this.id;}
	public String getName(){return this.name;}

	public void setId(Integer id){this.id = id;}
	public void setName(String name){this.name = name;}

	@Override
	public int compareTo(Student o){
		return this.getId() - o.getId();
	}
	@Override
	public String toString(){
		return "Id: "+this.id+" Name: "+this.name;
	}
}
public class ComparableInterfaceDemo{
	/* code by Vinay26k */
	public static void main(String [] args){
		System.out.println("Code by github: Vinay26k");
		List<Student> list = new ArrayList<>(){{
			add(new Student(5,"RAM"));
			add(new Student(2,"RAGHAV"));
			add(new Student(7,"RAHIM"));
			add(new Student(1,"RAMESH"));
			add(new Student(6,"RAJESH"));
		}};
		Collections.sort(list);
		list.forEach(System.out::println);
	}
}