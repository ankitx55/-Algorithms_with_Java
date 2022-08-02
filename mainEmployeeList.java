import java.util.ArrayList;

public class mainEmployeeList
{
    public static void main(String[] args){

        Employee ankitKumar = new Employee("Ankit", "Kumar", 11);
        Employee surajKumar = new Employee("Suraj", "Kumar", 22);
        Employee anandKumar = new Employee("Anand", "Kumar", 33);
        Employee manojKumar = new Employee("Manoj", "Kumar", 44);

        employeeLinkdeList list = new employeeLinkdeList();
        list.addToFront(ankitKumar);
        list.addToFront(surajKumar);
        list.addToFront(anandKumar);
        list.addToFront(manojKumar);

        list.printList();

    }
}
