import java.lang.reflect.Constructor;

public class Order {
    private int numHamburgers = 0;
    private int numCheeseburgers = 0;
    private int numVeggieburgers = 0;
    private int numSodas = 0;
    private Boolean orderToGo = false;
    private int orderNum = 1187;


    public Order(int numHamburgers, int numCheeseburgers, int numVeggieburgers, int numSodas, Boolean orderToGo, int orderNum){

        this.numHamburgers = numHamburgers;
        this.numCheeseburgers = numCheeseburgers;
        this.numVeggieburgers = numVeggieburgers;
        this.numSodas = numSodas;
        this.orderToGo = orderToGo;
        this.orderNum = orderNum;
    }

    
    public int getNumHamburgers(){
        return numHamburgers;
    }

    public void setNumHamburgers(int newNumHamburgers){
        
        if(newNumHamburgers > 0){
        
            this.numHamburgers = newNumHamburgers;
        }else{
            System.out.println("please enter a valid number of hamburgers");
        }
    }

    public int getNumCheeseburgers(){
        return numCheeseburgers;
    }

    public void setNumCheeseburgers(int newNumCheeseburgers){
        
        if(newNumCheeseburgers > 0){
        
            this.numCheeseburgers = newNumCheeseburgers;
        }else{
            System.out.println("please enter a valid number of Cheeseburgers");
        }
    }

    public int getNumVeggieburgers(){
        return numVeggieburgers;
    }

    public void setNumVeggieburgers(int newNumVeggieburgers){
        
        if(newNumVeggieburgers > 0){
        
            this.numVeggieburgers = newNumVeggieburgers;
        }else{
            System.out.println("please enter a valid number of Veggieburgers");
        }
    }

    public int getNumSodas(){
        return numSodas;
    }

    public void setNumSodas(int newNumSodas){
        
        if(newNumSodas > 0){
        
            this.numSodas = newNumSodas;
        }else{
            System.out.println("please enter a valid number of Sodas");
        }
    }

    public Boolean isOrderToGo(){
        
        return orderToGo;

    }

    public void setOrderToGo(Boolean toGoStatus){

        this.orderToGo = toGoStatus;

    }

    public int getOrderNum(){
        return orderNum;
    }

    public void setOrderNum(int newOrderNum){
        this.orderNum = newOrderNum;
    }
}
