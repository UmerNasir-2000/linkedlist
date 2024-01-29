package linkedlist;



public class LinkedList {
    static class Node<T> {
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
        if (isEmpty()) return;

        Node<Integer> previous = null;
        Node<Integer> current = this.head;

        while (current != null) {
            if (current.getData().equals(key)) {
                if (current == this.head) {
                    this.head = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                current = current.getNext();
            } else  {
                previous = current;
                current = current.getNext();
            }
        }
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
