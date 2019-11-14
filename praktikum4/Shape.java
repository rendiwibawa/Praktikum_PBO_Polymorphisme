package praktikum4;
public class Shape {
    //Private member variable
    private String color;
    //Constructor
    public Shape (String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "Shape[color="+color +"]";
    }
    //All shapes must have a method called getArea().
    public double getArea(){
        //we need to return some valeu to compile the program
        System.err.println("Shape unknown! Cannot computer area!");
        return 0;
    }
}
