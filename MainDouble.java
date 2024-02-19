import tugas3_DoubleLinkedList.DoubleLinkedList;

public class MainDouble {
    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("Create:");
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(7);
        doubleLinkedList.printLinkedList();
        System.out.println("============================");

        System.out.println("Append:");
        doubleLinkedList.append(2);
        doubleLinkedList.printLinkedList();
        doubleLinkedList.append(3);
        doubleLinkedList.printLinkedList();
        doubleLinkedList.append(4);
        doubleLinkedList.printLinkedList();
        System.out.println("============================");

        System.out.println("Prepend:");
        doubleLinkedList.prepend(6);
        doubleLinkedList.printLinkedList();
        doubleLinkedList.prepend(7);
        doubleLinkedList.printLinkedList();
        doubleLinkedList.prepend(8);
        doubleLinkedList.printLinkedList();
        System.out.println("============================");

        System.out.println("Remove First:");
        doubleLinkedList.removeFirst();
        doubleLinkedList.printLinkedList();
        doubleLinkedList.removeFirst();
        doubleLinkedList.printLinkedList();
        System.out.println("============================");

        System.out.println("Remove Last:");
        doubleLinkedList.removeLast();
        doubleLinkedList.printLinkedList();
        doubleLinkedList.removeLast();
        doubleLinkedList.printLinkedList();
        System.out.println("============================");

        System.out.println("Get Node By Index:");
        System.out.println("Double LinkedList Index of 2: " + doubleLinkedList.get(2));
        doubleLinkedList.printLinkedList();
        System.out.println("Double LinkedList Index of 1: " + doubleLinkedList.get(1));
        doubleLinkedList.printLinkedList();
        System.out.println("Double LinkedList Index of 0: " + doubleLinkedList.get(0));
        doubleLinkedList.printLinkedList();
        System.out.println("============================");

        System.out.println("Add Node By Index:");
        doubleLinkedList.insert(1, 8);
        doubleLinkedList.printLinkedList();
        doubleLinkedList.insert(3, 9);
        doubleLinkedList.printLinkedList();
        System.out.println("============================");

        System.out.println("Set Node By Index:");
        doubleLinkedList.set(1, 75);
        doubleLinkedList.printLinkedList();
        doubleLinkedList.set(2, 30);
        doubleLinkedList.printLinkedList();
        System.out.println("============================");

        System.out.println("Remove Node By Index:");
        doubleLinkedList.printLinkedList();
        System.out.println("Removed node (Index : 1): " +  doubleLinkedList.remove(1));
        doubleLinkedList.printLinkedList();
        System.out.println("Removed node (Index : 2): " +  doubleLinkedList.remove(2));
        doubleLinkedList.printLinkedList();
        System.out.println("============================");

        System.out.println("Head and Tail: ");
        doubleLinkedList.getHead();
        doubleLinkedList.getTail();
        System.out.println("============================");
    }
}
