package TugasBesar;

import java.util.Scanner;

public class JumlahKondisiPosisiSarana {
    Scanner c = new Scanner(System.in);
	int jumlah;
	String kondisi;
	String posisi;
    
 public void input(String input){
		System.out.print("Jumlah  = ");
		jumlah = c.nextInt();
		System.out.print("Kondisi = ");
		kondisi = c.next();
		System.out.print("Posisi  = ");
		posisi = c.next();
	}
        
        
	   public void output(String output){
		System.out.println("Jumlah : "+jumlah);
		System.out.println("Kondisi : "+kondisi);
		System.out.println("Posisi : "+posisi);
   	}
           
           
           boolean JumlahSteker(){
                return true;
           }
           String KondisiSteker(){
            return null;
           }
           boolean JumlahLcd(){
                return true;
           }
           boolean JumlahLampu(){
                return true;
           }
           boolean JumlahKipas(){
                return true;
           }
           boolean JumlahAc(){
                return true;
           }
    
    
}
