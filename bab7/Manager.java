package bab7;
public class Manager extends Karyawan {
    private float jamKerja = 7.5f ;
    
    public float jamKerja(){
        return jamKerja ;
    }
    
    public float getGajiManager() {
        return getGaji() * 2 ;
    }
}
