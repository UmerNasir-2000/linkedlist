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
    
}
