package praktikum2;
public class Line implements Relaction{
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    
    public Line (double x1,double x2,double y1,double y2 ){
        this.x1=x1;
        this.x1=x2;
        this.x1=y1;
        this.x1=y2;
        
    }
    public double getLegth(){
        double legth = Math.sqrt((x2-x1)*(x2-x1)+(x2-x1)*(x2-x1));
        return legth;
    }


    @Override
    public boolean isGreater(Object a, Object b) {
    double aLen=((Line)a).getLegth();
     double bLen=((Line)b).getLegth();
        return ((aLen>bLen));
    }

    @Override
    public boolean isLess(Object a, Object b) {
        double aLen=((Line)a).getLegth();
     double bLen=((Line)b).getLegth();
        return ((aLen<bLen));
    }

    @Override
    public boolean isEquals(Object a, Object b) {
        double aLen=((Line)a).getLegth();
     double bLen=((Line)b).getLegth();
        return ((aLen==bLen));
    }

    
}
