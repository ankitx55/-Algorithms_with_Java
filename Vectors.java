import java.util.List;
import java.util.Vector;


public class Vectors {
    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Ankit", "Kumar", 11));
        employeeList.add(new Employee("Charles", "Xavier", 22));
        employeeList.add(new Employee("William", "Cooper", 33));

        employeeList.set(2, new Employee("newWilliam", "newcooper", 44));

        employeeList.forEach(employee -> System.out.println(employee));
    }
}
