import java.util.*;
class Employee{
    private String name,id;
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

    @Override
    public String toString() {
        return "Employee -> [ name = "+ name +" id = "+ id +" ]";
    }
}
public class Implementation2{
    public static void main(String[] args) {
        Employee emp1 = new Employee("sam", "4");
        Employee emp2 = new Employee("amy", "2");
        Employee emp3 = new Employee("brad", "1");

        Set<Employee> treeSet = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee arg0, Employee arg1) {
                return arg0.getName().compareTo(arg1.getName());
            }
        });
        treeSet.add(emp1);
        treeSet.add(emp2);
        treeSet.add(emp3);
        for (Employee var : treeSet) {
            System.out.println(var);
        }
    }
}