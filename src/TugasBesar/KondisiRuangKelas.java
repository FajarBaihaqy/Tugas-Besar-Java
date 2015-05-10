
package TugasBesar;

import java.util.Scanner;


public class KondisiRuangKelas extends IdentitasRuangKelas {
    private int Panjang;
    private int Lebar;
    private int JumlahPintu;
    private int JumlahKursi;
    private int JumlahJendela;
    

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

    int LuasRuangan(int Panjang, int Lebar){
        return Panjang*Lebar;   
    }
    
    String BentukRuang(int Panjang, int Lebar){
        if(Panjang != Lebar){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai";
        }
    }
    
    String RasioLuas(int LuasRuang, int JumlahKursi){
       int RasioLuas = LuasRuang/JumlahKursi;
        if (RasioLuas >= 0.5){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai";
        }
        
   }
   
    String Pintu_Jendela(int JumlahPintu, int JumlahJendela){
       if(JumlahPintu >= 2 && JumlahJendela >=1){
           return "Sesuai";
       }
       
       else {
           return "Tidak Sesuai";
       }
        
   }
}
