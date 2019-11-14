             package praktikum4;
public class Rectangle extends Shape {
    //private member variable
    private int legth;
    private int width;
    //Constructor
    public Rectangle(String color, int legth,int width){
        super(color);
        this.legth=legth;
        this.width=width;
    }
    public String toString(){
        return "Rectangle[legth="+legth+",width="+width+","+super.toString()+ "]";
    }
    //override the inheritance gaetArea
    public double getArea(){
        return legth*width;
    }
}
