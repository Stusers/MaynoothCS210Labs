public class LinkedList {

    private class Node {

        private Node next;
        private String name;
        private int age;
        private String degree;
        private int yearOfStudy;

        public Node(String name, String degree, int yearOfStudy, int age) {

            this.next = null;
            this.name = name;
            this.degree = degree;
            this.yearOfStudy = yearOfStudy;
            this.age = age;
        }
    }

    private Node head;

    public LinkedList() {
        this.head = null;

    }


    public void add(String name, String degree, int yearOfStudy, int age) {
        Node newNode = new Node(name, degree, yearOfStudy, age);
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


    public void addFirst(String name, String degree, int yearOfStudy, int age) {
        Node newNode = new Node(name,degree, yearOfStudy, age);
        newNode.next = head;
        head = newNode;
    }


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

    public boolean isEmpty() {
        return head == null;
    }

    private Node searching(String header, String target) {

        if (head == null) {
            System.out.println("List is empty");
        }
        else {
            Node current = head;
            while (current != null) {

                switch(header){


                    case "age":
                        int temp = Integer.parseInt(target);
                        if (current.age == temp) return current;
                        break;
                    case "yearOfStudy":
                        int temp1 = Integer.parseInt(target);
                        if (current.yearOfStudy == temp1) return current;
                        break;
                    case "name":
                        if (current.name.equals(target)) return current;
                        break;
                    case "degree":
                        if (current.degree.equals(target)) return current;
                        break;

                }
                current = current.next;
            }

        }
        return null;
    }

    public void print(String header, String target) {
        Node current = searching(header, target);
        System.out.println(current.name + ", " + current.age + ", " + current.degree + ", " + current.yearOfStudy);

    }

    public void printList() {

        if (head == null) {
            System.out.println("List is empty");

        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.name + ", " + current.age + ", " + current.degree + ", " + current.yearOfStudy);
                current = current.next;
            }

        }
    }

    public void remove(String header, String target) {
        if (head == null) {
            System.out.println("List is empty");
        }
        else {
            Node current = head;
            while (current.next != null) {

                if (current.next.equals(searching(header, target))) {
                    current.next = current.next.next;
                    break;
                }

                current = current.next;
            }
        }

    }






}