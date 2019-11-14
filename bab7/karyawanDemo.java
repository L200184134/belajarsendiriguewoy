package bab7;
public class karyawanDemo {
    public static void main (String[] args){
        Karyawan k1 = new Karyawan();
        k1.setNama("Luffy");
        k1.setGaji(2500000);
        k1.setUsia(21);
        
        System.out.println(k1.getNama());
        System.out.println(k1.getGaji());
        System.out.println(k1.getUsia());
    }
}
