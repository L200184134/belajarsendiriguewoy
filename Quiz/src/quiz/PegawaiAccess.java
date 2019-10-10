
package quiz;

public class PegawaiAccess {
    public static void main (String[] args){
        Pegawai p = new Pegawai ();
        p.setNama("Mahardhika");
        p.setNIM("L200184134");
        System.out.println ("Nama : "+p.getNama());
        System.out.println("NIM : "+p.getNIM());
        Pegawai pe = new Pegawai (1);
    }
}
