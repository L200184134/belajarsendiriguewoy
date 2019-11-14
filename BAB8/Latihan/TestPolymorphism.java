/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB8.Latihan;

/**
 *
 * @author LABRPL-26
 */
public class TestPolymorphism {
    public static void main(String[] args){
        Kucing meng =  new Kucing ();
        Anjing ASU = new Anjing ();
        
        meng.beriNama("TOM");
        ASU.beriNama("BULL");
        System.out.println(meng.panggilNama());
        System.out.println(meng.perilaku());
        System.out.println(meng.suara());
        System.out.println(ASU.panggilNama());
        System.out.println(ASU.perilaku());
        System.out.println(ASU.Suara());
    }
}
