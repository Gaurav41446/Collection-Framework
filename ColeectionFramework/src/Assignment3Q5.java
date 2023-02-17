import java.util.Hashtable;
import java.util.Objects;

 class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return 42; // always return a fixed number
    }
}
public class Assignment3Q5 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Gaurav", 1);
        Employee e2 = new Employee("Rahul", 2);

        Hashtable<Employee, String> ht = new Hashtable<>();
        ht.put(e1, "Employee 1");
        ht.put(e2, "Employee 2");

        String emp1 = ht.get(new Employee("Gaurav", 1));
        String emp2 = ht.get(new Employee("Rahul", 2));
        String emp3 = ht.get(new Employee("Nishant", 3));

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}

