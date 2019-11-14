package Tugas_Praktikum;
public class TestRect {
  
    public static void main(String[] args) {
        
        Rect baru1 = new Rect(1,1,4,4);
        int x= baru1.x1;
        int y= baru1.y1;
        int z= baru1.x2;
        int w= baru1.y2;
        Rect baru2 = new Rect(5,6);
        baru1.move(1, 2);
        
        System.out.println("<"+baru1.x1+","+baru1.y1+"> Is Inside the union");
        System.out.println("["+x+","+y+": "+z+","+w+"] union ["+baru1.x1+","+baru1.y1+"; "+baru2.x2+","+baru2.y2+"] = ["+x+","+y+"; "+baru2.x2+","+baru2.y2+"]");
        System.out.println("["+x+","+y+": "+z+","+w+"] union ["+baru1.x1+","+baru1.y1+"; "+baru2.x2+","+baru2.y2+"] = ["+baru1.x1+","+baru1.y1+"; "+z+","+w+"]");
        
        
        
        
    }
    
}
    

