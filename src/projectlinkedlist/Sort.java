package projectlinkedlist;

public class Sort {

    public static void InsertionSort(LinkedList list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0 && (list.get(j - 1).compareTo(list.get(j))) > 0; j--) {
                list.swap(j, j - 1);
            }
        }
    }
}
