//Febri
package TugasBesar;

import java.util.Scanner;

public class KebersihanRuangKelas {
    String SirkulasiUdara;
    int NilaiPencahayaan;
    int Kelembapan;
    int Suhu;
    
    Scanner e=new Scanner(System.in);
    public void Kebersihan(){
        System.out.print("Sirkulasi udara = ");
        SirkulasiUdara=e.next();
        System.out.print("Nilai pencahayaan = ");
        NilaiPencahayaan = e.nextInt();
        System.out.print("Kelembapan = ");
        Kelembapan = e.nextInt();
        System.out.print("Suhu = ");
        Suhu = e.nextInt();
    }
    
    String SirkulasiUdara(){
        return null;
    }
    
    
    boolean Pencahayaan(){
        return true;   
    }
    
    
    boolean Kelembapan(){
        return true;
        
    }
    
    
    boolean Suhu(){
        return true;
    }
}
