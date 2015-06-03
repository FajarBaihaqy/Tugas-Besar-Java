package TugasBesar;

import java.util.Scanner;

public class JumlahKondisiPosisiSarana {
    Scanner c = new Scanner(System.in);
    int JumlahSteker;
    String KondisiSteker;
    String PosisiSteker;
    int JumlahKabelLcd;
    String KondisiKabelLcd;
    String PosisiKabelLcd;
    int JumlahLampu;
    String KondisiLampu;
    String PosisiLampu;
    int JumlahKipas;
    String KondisiKipas;
    String PosisiKipas;
    int JumlahAc;
    String KondisiAc;
    String PosisiAc;
    String Ssid;
    int Bandwidth;
    int JumlahCctv;
    String KondisiCctv;
    String PosisiCctv;
    
 public void input(String input){
		System.out.print("Jumlah  = ");
		JumlahSteker = c.nextInt();
		System.out.print("Kondisi = ");
		KondisiSteker = c.next();
		System.out.print("Posisi  = ");
		PosisiSteker = c.next();
                
                System.out.print("Jumlah  = ");
		JumlahKabelLcd = c.nextInt();
		System.out.print("Kondisi = ");
		KondisiKabelLcd = c.next();
		System.out.print("Posisi  = ");
		PosisiKabelLcd = c.next();
                
                System.out.print("Jumlah  = ");
		JumlahLampu = c.nextInt();
		System.out.print("Kondisi = ");
		KondisiLampu = c.next();
		System.out.print("Posisi  = ");
		PosisiLampu = c.next();
                
                System.out.print("Jumlah  = ");
		JumlahKipas = c.nextInt();
		System.out.print("Kondisi = ");
		KondisiKipas = c.next();
		System.out.print("Posisi  = ");
		PosisiKipas = c.next();
                
                System.out.print("Jumlah  = ");
		JumlahAc = c.nextInt();
		System.out.print("Kondisi = ");
		KondisiAc = c.next();
		System.out.print("Posisi  = ");
		PosisiAc = c.next();
                
                System.out.println("Nama SSID = ");
                Ssid= c.next();
                System.out.println("Bandwidth = ");
                Bandwidth= c.nextInt();
                
                System.out.print("Jumlah  = ");
		JumlahCctv = c.nextInt();
		System.out.print("Kondisi = ");
		KondisiCctv = c.next();
		System.out.print("Posisi  = ");
		PosisiCctv = c.next();
	}
        
        
	   public void output(String output){
		System.out.println("Jumlah steker : "+JumlahSteker);
		System.out.println("Kondisi steker : "+KondisiSteker);
		System.out.println("Posisi steker : "+PosisiSteker);
                
                System.out.println("Jumlah kabel Lcd : "+JumlahKabelLcd);
		System.out.println("Kondisi kabel Lcd : "+KondisiKabelLcd);
		System.out.println("Posisi kabel Lcd : "+PosisiKabelLcd);
                
                System.out.println("Jumlah lampu : "+JumlahLampu);
		System.out.println("Kondisi lampu : "+KondisiLampu);
		System.out.println("Posisi lampu : "+PosisiLampu);
                
                System.out.println("Jumlah kipas : "+JumlahKipas);
		System.out.println("Kondisi kipas : "+KondisiKipas);
		System.out.println("Posisi kipas : "+PosisiKipas);
                
                System.out.println("Jumlah AC : "+JumlahAc);
		System.out.println("Kondisi AC : "+KondisiAc);
		System.out.println("Posisi AC : "+PosisiAc);
                
                System.out.println("SSID : "+Ssid);
		System.out.println("Bandwidth : "+Bandwidth);
                
                System.out.println("Jumlah CCTV : "+JumlahCctv);
		System.out.println("Kondisi CCTV : "+KondisiCctv);
		System.out.println("Posisi CCTV: "+PosisiCctv);

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
           
           String Ssid(){
               return null;
           }
           
           boolean JumlahCctv(){
               return true;
           }
    
    
}
