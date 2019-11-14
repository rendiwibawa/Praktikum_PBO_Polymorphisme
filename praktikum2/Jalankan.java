package praktikum2;
public class Jalankan {
        
    public static void main(String[] args) {
        
        Line garis1 = new Line(1,2,3,4);
        Line garis2 = new Line(10,20,30,40);
        
        garis1.getLegth();
        garis2.getLegth();
        
        System.out.println("garis1 > garis2 = " +garis1.isGreater(garis1, garis2));
        System.out.println("garis1 < garis2 = " +garis1.isLess(garis1,garis2));
        System.out.println("garis1 == garis 2 = " +garis1.isEquals(garis1,garis2));    
    }
}


    

