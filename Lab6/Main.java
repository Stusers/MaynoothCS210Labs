import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        que pile = new que(size);

        for (int index = 0; index < size; index++) {



                pile.add(Integer.parseInt(sc.nextLine()));

        }

        pile.printQueue();

        while(true){
            String temp = sc.nextLine();


            if (temp.equals("Print")){
                pile.printQueue();
            }
            else if (temp.equals("Remove")) {
                pile.pop();

            }
            else {

                pile.add(Integer.parseInt(temp));

            }

        }






    }


}
