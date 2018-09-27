package projectlinkedlist;

public class ProjectLinkedList {
    
    public static void main(String[] args) {
        System.out.println("TEST");
        LinkedList<Integer> myLL = new LinkedList<>(10);
        myLL.add(2);
        myLL.add(1);
        myLL.add(5);
        myLL.add(4);
        myLL.add(7);
        myLL.add(3);
        myLL.add(6);
        myLL.remove(7);
        myLL.remove(6);
        myLL.remove(5);
        Sort.InsertionSort(myLL);
        myLL.displayList();
    }
    
}
