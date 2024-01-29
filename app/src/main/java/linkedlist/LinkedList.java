package linkedlist;

class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }
}

public class LinkedList {

    private Node<Integer> head;
    private Node<Integer> tail;

    public LinkedList() {
        this.head = this.tail = null;
    }

    private boolean isEmpty() {
        return this.head == null && this.tail == null;
    }

    private boolean hasOneNode() {
        return this.head == this.tail;
    }

    public Node<Integer> getHead() {
        return this.head;
    }

    public Node<Integer> getTail() {
        return this.tail;
    }

    public void deleteKey(Integer key) {
        throw new UnsupportedOperationException();
    }

    public void shift() {
        if (isEmpty()) return;

        else if (hasOneNode()) {
            this.head = this.tail = null;
        }

        else {
            this.head = this.head.getNext();
        }
    }

    public void append(Integer value) {
        Node<Integer> newNode = new Node<Integer>(value);

        if (isEmpty()) {
            this.head = this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void print() {
        if (isEmpty()) return;

        Node<Integer> current = this.getHead();

        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }

        System.out.print("NULL");
    }
    
}
