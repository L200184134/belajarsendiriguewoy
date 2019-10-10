package quiz;
public class Pegawai {
    private String Nama ;
    private String NIM ;
    int choice ;
    
    Pegawai(){
        System.out.println("####Program Quiz####");
    }
    protected void setNama(String Nama){
        this.Nama = Nama ;
    }
    public String getNama(){
        return Nama ;
    }
    protected void setNIM(String NIM){
        this.NIM = NIM ; 
    }
    public String getNIM (){
        return NIM ;
    }
    
    Pegawai(int choice){
        setPosition (choice);
    }
    
    void setPosition(int choice){
        System.out.println("To know detail the salary, input your position :\n1. Manager Senior \n2. Manager Junior");
        double kurs = 14500 ;
        if(choice == 1){
            double salary = 2000;
            int overtime = 50 ;
            System.out.println("Salary = "+salary+"\novertime = "+overtime);
            System.out.println("If the Rate of Exchange dollar to Rupiah = "+kurs+"\nsalary in rupiah = "+kurs*salary);
        }
        else{
            if(choice == 2){
                double salary2 = 1500;
                int overtime2 = 35 ;
                System.out.println("Salary = "+salary2+"\novertime = "+overtime2);
                System.out.println("If the Rate of Exchange dollar to Rupiah = "+kurs+"\nsalary in rupiah = "+kurs*salary2);
            }
            else{
                System.out.println("Please enter the correct number.");
            }
        
        }        
            
            
    
    }
}
