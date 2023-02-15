import java.util.*;
import java.util.Scanner;
public class FastFoodKitchen {

    private ArrayList<Order> orderList = new ArrayList<Order>(); 
    private static int nextOrderNum = 1;
    
    FastFoodKitchen kitchen = new FastFoodKitchen();
    Scanner sc = new Scanner(System.in);

    public FastFoodKitchen(){

    }

    public FastFoodKitchen(Order order1, Order order2, Order order3){
        orderList.add(getNextOrderNum(), order1);
        orderList.add(getNextOrderNum(), order2);
        orderList.add(getNextOrderNum(), order3);
    }

    public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo){
       String thisOrderNum = "Order" + getNextOrderNum();
        Order order =  new Order(ham, cheese, veggie, soda, toGo); 
    }

    public int getNextOrderNum(){
        return nextOrderNum;
    }

    private static incrementNextOrderNum(){
        nextOrderNum++;
    }

    while (kitchen.getNumOrdersPending() != 0) {
        // see what the user wants to do
        System.out.println("Please select from the following menu of options, by typing a number:");
        System.out.println("\t 1. Order food");
        System.out.println("\t 2. Cancel last order");
        System.out.println("\t 3. Show number of orders currently pending.");
        System.out.println("\t 4. Exit");

        int num = sc.nextInt();
        switch (num) {

            case 1:
                System.out.println("How many hamburgers do you want?");
                int ham = sc.nextInt();
                System.out.println("How many cheeseburgers do you want?");
                int cheese = sc.nextInt();
                System.out.println("How many veggieburgers do you want?");
                int veggie = sc.nextInt();
                System.out.println("How many sodas do you want?");
                int sodas = sc.nextInt();
                System.out.println("Is your order to go? (Y/N)");
                char letter = sc.next().charAt(0);
                boolean TOGO = false;
                if (letter == 'Y' || letter == 'y') {
                    TOGO = true;
                }
                int orderNum = kitchen.addOrder(ham, cheese, veggie, sodas, TOGO);
                System.out.println("Thank-you. Your order number is " + orderNum);
                System.out.println();
                break;
            case 2:
                boolean ready = kitchen.cancelLastOrder();
                if (ready) {
                    System.out.println("Thank you. The last order has been canceled");
                } else {
                    System.out.println("Sorry. There are no orders to cancel.");
                }
                System.out.println();
                break;
            case 3:
                System.out.println("There are " + kitchen.getNumOrdersPending() + " pending orders");
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Sorry, but you need to enter a 1, 2, 3 or a 4");

        } // end switch statements

    } // end while loop

}
