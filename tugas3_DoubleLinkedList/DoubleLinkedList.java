package tugas3_DoubleLinkedList;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoubleLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0)
            return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0)
            return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    /*
     * Pada praktikum kali ini silakan lengkapi function/method:
     * 1. get() -> untuk mendapatkan node berdasarkan index
     * 2. set() -> mengganti nilai pada node berdasarkan index
     * 3. insert() -> untuk menambahkan node berdasarkan index
     * 4. remove() -> untuk menghapus node berdasarkan index
     *
     * Silahkan modifikasi kode sehingga dapat menampilkan output seperti di soal.
     * Modfifikasi kode hanya diperbolehkan pada bagian yang ditandai
     * dan diperbolehkan.
     *
     * JAWABAN INI MILIK
     * RAKASYAEL HIZKIA KOLONDAM
     * 2023105490 - SISTEM INFORMASI
     *
     * Selamat mengerjakan!
     */

    // Mendapatkan node berdasarkan indeks indeks urutan
    public Node get(int index) {
        if(head == null){
            System.out.println("Empty List");
            return null;
        }
        else{
            Node current = head;
            int counter = 0;
            while(counter < index){
                current = current.next;
                counter++;
            }
            if(current != null){
                return current;
            }
            else{
                System.out.println("Index not found");
                return null;
            }
        }
    }

    // Mengganti nilai/value node berdasarkan indeks urutan
    public void set(int index, int value) {
        if(head == null){
            System.out.println("Empty List");
        }
        else{
            Node current = head;
            int counter = 0;
            while(counter <= index - 1){
                current = current.next;
                counter++;
            }
            if(current != null){
                current.value = value;
            }
            else{
                System.out.println("Index not found");
            }
        }
    }

    // Menambahkan node berdasarkan indeks urutan
    public void insert(int index, int value) {
        Node newNode = new Node(value);
        if(head == tail){
            System.out.println("Empty list");
        }
        else if(index == 0){
            prepend(value);
            length++;
        }
        else{
            Node current = head;
            int counter = 0;
            while(counter < index - 1){
                current = current.next;
                counter++;
            }
            if(current == tail){
                append(value);
                length++;
            }
            if(current != null){
                newNode.next = current.next;
                newNode.prev = current;
                if(current.next != null){
                    current.next.prev = newNode;
                }
                current.next = newNode;
                length++;
            }
            else{
                System.out.println("Index not found");
            }
        }
    }

    // Menghapus node berdasarkan indeks urutan
    public Node remove(int index) {
        if(head == null){
            System.out.println("Empty list");
            return null;
        }
        else if(index == 0){
            Node removed = head;
            removeFirst();
            length--;
            return removed;

        }
        else if(index == length - 1){
            Node current = tail;
            removeLast();
            length--;
            return current;
        }
        else{
            Node current = head;
            Node removed;
            int counter = 0;

            while(counter < index){
                current = current.next;
                counter++;
            }
            if(current == tail){
                tail = current.prev;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            removed = current;

            current.next = null;
            current.prev = null;

            length--;
            return removed;
        }

    }

}
