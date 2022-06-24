import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
/*

    resizable array implementation of thr list interface
    ArrayList(int initialCapacity) this constructs an empty list
    with the specified intial capacity
    List <integer> varName
*/


//        ArrayList<Integer> newList = new ArrayList<Integer>();
//        newList.add(5);
//        System.out.println(ArrayList.toString(newList));


//        arraylist.add("string", int, int,) = adds a value to the list
//        arraylist.set(index, "string", int, int) = replaces the value at that index
//        arraylist.get(index) = gives the value or thr element at that index

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ankit", "Kumar", 11));
        employeeList.add(new Employee("Charles", "Xavier", 22));
        employeeList.add(new Employee("William", "Cooper", 33));

        employeeList.set(2, new Employee("newWilliam", "newcooper", 44));

        employeeList.forEach(employee -> System.out.println(employee));

//        System.out.println(employeeList.get(2));

    }
}
