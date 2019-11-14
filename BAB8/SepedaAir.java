package BAB8;

public class SepedaAir extends Sepeda{
    void run(){
        System.out.println("Hanya bisa berjalan di atas air");
    }
    
    public static void main (String[] args){
        Sepeda s = new SepedaAir();
        
        s.run();
    }
}

