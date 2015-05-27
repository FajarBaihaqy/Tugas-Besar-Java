
package TugasBesar;

import java.util.Scanner;

public class LingkunganRuangKelas {
    
    String KondisiLantai;
    String KondisiDinding;
    String KondisiAtap;
    String KondisiPintu;
    String KondisiJendela;
    
    Scanner d=new Scanner(System.in);
    
    public void input(String lingkungan){
        System.out.print("Kondisi lantai  = ");
        KondisiLantai=d.next();
        System.out.print("Kondisi dinding = ");
        KondisiDinding=d.next();
        System.out.print("Kondisi atap    = ");
        KondisiAtap=d.next();
        System.out.print("Kondisi pintu   = ");
        KondisiPintu=d.next();
        System.out.print("Kondisi jendela = ");
        KondisiJendela=d.next();
        }
    
    String lantai(){
        return KondisiLantai;
    }
    String semua(){
        return null;
    }
}
