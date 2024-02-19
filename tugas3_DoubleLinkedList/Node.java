package tugas3_DoubleLinkedList;

public class Node {
    int value;
    Node next;
    Node prev;

    Node(int value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return String.valueOf(value);
    }
}
