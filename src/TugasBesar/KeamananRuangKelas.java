//Febri
package TugasBesar;

import java.util.Scanner;

public class KeamananRuangKelas {
     String Kekokohan;
     String KunciPintuJendela;
     String Bahaya;
     
     Scanner g = new Scanner(System.in);
    public void Keamanan(){
        System.out.println("Apa gedung ini kokoh    = ");
        Kekokohan=g.next();
        System.out.println("Kunci pintu dan jendela = ");
        KunciPintuJendela=g.next();
        System.out.println("Apa gedung ini bahaya   = ");
        Bahaya=g.next();
    }
    
    String Kekokohan(){
        return null;
    }
    
    String KunciPintuJendela(){
        return null;
    }
    
    String Bahaya(){
        return null;
    }
}