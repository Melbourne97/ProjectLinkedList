package projectlinkedlist;

public class LinkedList<T extends Comparable<T>> {

    public Node<T> head, tail, next;
    public int length;
    private int size;

    public LinkedList(T dat) {
        head = new Node<>(dat);
        size = 0;
    }

    public int getLength() {
        return length;
    }

    public void displayList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int find(Node<T> n) {
        Node<T> t = head;
        int index = 0;
        while (t != n) {
            index++;
            t = t.next;
        }
        return index;
    }

    public T get(int index) {
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp.data;
    }

    public Node<T> peek(int index) {
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void add(int item) {
        Node<T> temp = new Node(item);
        if (this.length == 0) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        this.length++;
    }

    public boolean remove(T item) {
        boolean foundit = false;
        if (this.length > 0) {
            Node<T> temp = head;
            Node<T> previous = head;
            while (!temp.data.equals(item) && temp.next != null) {
                previous = temp;
                temp = temp.next;
            }
            if (temp.data.equals(item)) {
                foundit = true;
                this.length--;
                if (temp == head) {
                    head = head.next;
                }
                if (temp == tail) {
                    tail = previous;
                }
                previous.next = temp.next;
                if (length == 0) {
                    tail = head;
                }
            }
        }
        return foundit;
    }

    public void set(int index, T data) {
        Node<T> temp = head;
        if (index == 0) {
            head = new Node<>(data);
            head.setNext(temp.getNext());
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            Node<T> next = temp.getNext().getNext();
            Node<T> add = new Node<>(data);
            temp.setNext(add);
            add.setNext(next);
        }
    }

    public int size() {
        return this.size;
    }

    public void swap(int a, int b) {
        T temp = get(a);
        set(a, get(b));
        set(b, temp);
    }

    public void addSorted(T item) {
        Node<T> addMe = new Node<>(item);
        if (this.length == 0) {
            head = addMe;
        } else {
            Node<T> temp = head;
            Node<T> previous = head;

            if (head.data.compareTo(item) > 0) {
                addMe.next = head;
                head = temp;
            } else {

                while (temp.data.compareTo(item) < 0 && temp.next != null) {
                    previous = temp;
                    temp = temp.next;
                }
                if (temp.data.compareTo(item) >= 0) {
                    previous.next = addMe;
                    addMe.next = temp;
                }
                if (temp.data.compareTo(item) < 0) {
                    temp.next = addMe;
                    addMe.next = null;
                }
            }
            length++;
        }
    }
}
