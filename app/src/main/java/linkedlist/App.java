
package linkedlist;

public class App {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(1);
        list.append(2);
        list.append(2);
        list.append(2);
        list.append(2);
        list.append(3);
        list.append(4);

        list.deleteKey(1);

        list.print();
    }
}
