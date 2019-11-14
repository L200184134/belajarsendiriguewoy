package BAB8.Latihan;

public class Pet {
    private String Name ;
    
    public void beriNama (String beriNama){
        this.Name = beriNama;
    }
    
    public String panggilNama(){
        return this.Name ;
    }
    
    public String perilaku(){
        return "Hewan Penurut";
    }
}
