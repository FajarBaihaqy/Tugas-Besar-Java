
package TugasBesar;

import java.util.Scanner;


public class KondisiRuangKelas extends IdentitasRuangKelas {
    private int Panjang;
    private int Lebar;
    private int JumlahPintu;
    private int JumlahKursi;
    private int JumlahJendela;
    int LuasRuang;
    

    public int getPanjang() {
        return Panjang;
    }

    public void setPanjang(int Panjang) {
        this.Panjang = Panjang;
    }

    public int getLebar() {
        return Lebar;
    }

    public void setLebar(int Lebar) {
        this.Lebar = Lebar;
    }

    public int getJumlahPintu() {
        return JumlahPintu;
    }

    public void setJumlahPintu(int JumlahPintu) {
        this.JumlahPintu = JumlahPintu;
    }

    public int getJumlahKursi() {
        return JumlahKursi;
    }

    public void setJumlahKursi(int JumlahKursi) {
        this.JumlahKursi = JumlahKursi;
    }

    public int getJumlahJendela() {
        return JumlahJendela;
    }

    public void setJumlahJendela(int JumlahJendela) {
        this.JumlahJendela = JumlahJendela;
    }

    public int LuasRuangan(int Panjang, int Lebar){
        
        LuasRuang = Panjang*Lebar;
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan panjang");
        System.out.println("Masukkan lebar");
        System.out.println("Luas Ruangan"+LuasRuang);
        
        if(Panjang == Lebar){
            System.out.println("Tidak Sesuai");
        }
        if(Panjang != Lebar){
            System.out.println("Sesuai");
        }
        
        
        
        
        
        return 0;
        
    }
    
   public int RasioLuas(int LuasRuang, int JumlahKursi){
       int RasioLuas = LuasRuang/JumlahKursi;
        if (RasioLuas >= 0.5){
            System.out.println("Sesuai");
        }
        if(RasioLuas < 0.5){
            System.out.println("Tidak Sesuai");
        }
        return 0;
   }
   
   int Pintu_Jendela(){
       if(JumlahPintu >= 2){
           System.out.println("Sesuai");
       }
       else if (JumlahPintu < 2){
           System.out.println("Tidak Sesuai");
       }
       
       if(JumlahJendela >= 1){
           System.out.println("Sesuai");
       }
       
       else if(JumlahJendela < 1){
           System.out.println("Tidak Sesuai");
       }
        return 0;
   }
}
