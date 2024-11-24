import java.util.Scanner;

public class Main{

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        Stack pile = new Stack();
        Stack temp = new Stack();
        Stack word1 = new Stack();
        Stack word2 = new Stack();


        while(true){
            String input = sc.nextLine();
            if (input.equals("Arrived")){
                break;
            }
            else if (input.equals("Go Back")){
                pile.pop();
                temp.pop();
                word1.pop();
                word2.pop();
            }
            else if (input.matches("^Go (North|South|East|West)$")){
                pile.push(input);
                temp.push(input);
                word1.push(input);
                word2.push(input);
            }
        }

        if (isPally(word1, word2)){
            System.out.println("Pally");
        }
        else {
            System.out.println("Non-Pally");
        }




        System.out.println("-----------");
        while(!temp.isEmpty()){

            String dir = temp.peek();
            temp.pop();

            switch(dir){

                case "Go North":
                    //System.out.println("Go South");
                    break;

                case "Go South":
                    //System.out.println("Go North");
                    break;

                case "Go East":
                    //System.out.println("Go West");
                    break;

                case "Go West":
                    //System.out.println("Go East");
                    break;

                default:
                    break;
            }




        }
    }

    public static boolean isPally(Stack ob1, Stack ob2){

        while (ob1.isEmpty() != true){

            if (ob1.peekFirst().equals(ob2.peek())){
                ob1.popFirst();
                ob2.pop();
            }
            else{
                return false;
            }


        }
        return true;
    }







}









