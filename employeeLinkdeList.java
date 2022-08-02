public class employeeLinkdeList
{
    private EmployeeNode head;

    public void addToFront(Employee employee){

        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head=node;

    }

    public void printList(){
        EmployeeNode current =head;
        System.out.print("Head->");
        while(current!=null)
        {
            System.out.print(current + " ---> ");
            current=current.getNext();
        }
        System.out.print("null");
    }

}
