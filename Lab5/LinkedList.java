public class LinkedList {
    private class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public LinkedList() {
        this.head = null;
    }


    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Add to the beginning of the list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Remove the last element
    public void pull() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    // Remove the first element
    public void pullFirst() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null){
            head = null;

            }
        else {
            head = head.next;
        }
    }

    // Peek at the last element
    public String peak() {
        if (head == null) {
            System.out.println("List is empty");
            return "";
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            return current.data;
        }
    }

    // Peek at the first element
    public String peakFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return "";
        } else {
            return head.data;
        }
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }
}