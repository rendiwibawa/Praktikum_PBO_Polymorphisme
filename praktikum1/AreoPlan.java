package praktikum1;
public class AreoPlan extends Vehicle{
    @Override
    public void walk(){
        System.out.println("AreoPlane is Flying");
    }
    public static void main(String[] args) {
        AreoPlan garuda = new AreoPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
