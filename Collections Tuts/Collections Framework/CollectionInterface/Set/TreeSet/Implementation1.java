import java.util.*;
class Employee implements Comparable<Employee>{
    String name, id;
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
   /* @Override
    public int compareTo(Employee otherEmployee) {
        return this.name.compareTo(otherEmployee.name);
    } */

    @Override
    public int compareTo(Employee arg0) {
        return this.id.compareTo(arg0.id);
    }

    @Override
    public String toString() {
        return "Employee [ name = "+ name +" id = "+id+" ]";
    }
}
public class Implementation1{
    public static void main(String[] args) {
        Employee emp1 = new Employee("sam", "4");
        Employee emp2 = new Employee("amy", "2");
        Employee emp3 = new Employee("brad", "1");

        Set<Employee> tree = new TreeSet<>();
        tree.add(emp1);
        tree.add(emp2);
        tree.add(emp3);

        System.out.println("Using comparable [class implements comparable]");

        System.out.println("Output : ");
        for (Employee var : tree) {
            System.out.println(var);
        }
    }
}