package projectlinkedlist;

class Node<T extends Comparable<T>> {

    public final T data;
    public Node<T> next;

    public Node(T dat) {
        data = dat;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public boolean setNext(Node<T> n) {
        this.next = n;
        return true;
    }
}
