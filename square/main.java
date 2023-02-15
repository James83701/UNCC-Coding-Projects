import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        // 0. get width from Scanner
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter the width of the square.");
        int widthInput = input.nextInt(); 

        // 1. create a Square Object with width
        Square shape = new Square(widthInput);

        // 2. call getWidth(), print result
        System.out.println("the width of your square is " + (shape.getWidth()));

        // 3. call getArea(), print result
        System.out.println("the area of your square is " + (shape.getArea()));
    
    }//end of main method

}//end of class
