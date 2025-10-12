public class AreaCalculator {
    public static int calculateArea(int side){
        return side*side;
    }
    public static int calculateArea(int length, int width){
        return length*width;  // area of rectangle
    }
    public static void main(String[]args){
        int squarearea=calculateArea(9);
        int rectanglearea=calculateArea(7*9);
        System.out.println("area of square is:"+squarearea);
        System.out.println("area of rectangle is:"+rectanglearea);


    }
    
}
