// A class that represents a square
public class Square {
    
    // field - width of type of int
    int width;

    // constructor
    public Square(){
    width = 10;
    }
    // constructor with width
    public Square(int widthInput){
    
    width = widthInput;
    }
    // method - getWidth()
    public int getWidth(){
        
        return width;
    }
    // method - getArea()
    public int getArea(){
       
        int area = width * width;
        return area;
    }
}//end of class