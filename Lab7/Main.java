import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.add("Bunny", "CSSE", 2, 26);
        list.add("Larry", "Arts", 1, 18);
        list.add("Steve", "ComputationalThinking", 4, 32);

        System.out.print("Enter header: ");
        String header = sc.nextLine().toLowerCase();
        System.out.print("Enter target: ");
        String target = sc.nextLine().toLowerCase();

        while (true) {
            System.out.print("Enter command: ");
            String input = sc.nextLine();
            if (input.equals("print")) {
                list.print(header, target);
                break;
            } else if (input.equals("remove")) {
                list.remove(header, target);
                list.printList();
                break;
            }
        }
        sc.close();
    }
}
