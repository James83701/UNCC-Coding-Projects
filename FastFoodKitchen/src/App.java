import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Order order1 = new Order(3, 5, 4, 10, true, 1);
        Order order2 = new Order(8, 0, 3, 3, false, 2);
        Order order3 = new Order(1, 1, 0, 2, false, 3);

        order1.setNumSodas(12);

        System.out.println(
            "Order{" + "numHamburgers = " + order1.getNumHamburgers() + ", " + "numCheeseburgers = " + 
            order1.getNumCheeseburgers() + ", " + "numVeggieburgers = " + order1.getNumVeggieburgers() + 
            ", " + "numSodas = " + order1.getNumSodas() + ", " + "orderToGo = " + order1.isOrderToGo() + ", " + "orderNum = " + order1.getOrderNum() + "}"
        );
        
        System.out.println();

        System.out.println(
            "Order{" + "numHamburgers = " + order2.getNumHamburgers() + ", " + "numCheeseburgers = " + 
            order2.getNumCheeseburgers() + ", " + "numVeggieburgers = " + order2.getNumVeggieburgers() + 
            ", " + "numSodas = " + order2.getNumSodas() + ", " + "orderToGo = " + order2.isOrderToGo() + ", " + "orderNum = " + order2.getOrderNum() + "}"
        );
        
        System.out.println();
        
        System.out.println(
            "Order{" + "numHamburgers = " + order3.getNumHamburgers() + ", " + "numCheeseburgers = " + 
            order3.getNumCheeseburgers() + ", " + "numVeggieburgers = " + order3.getNumVeggieburgers() + 
            ", " + "numSodas = " + order3.getNumSodas() + ", " + "orderToGo = " + order3.isOrderToGo() + ", " + "orderNum = " + order3.getOrderNum() + "}"
        );
        
        System.out.println();
        
        
    }
}
