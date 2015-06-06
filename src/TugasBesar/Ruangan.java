package TugasBesar;

import java.util.Scanner;


abstract public class Ruangan {
    Scanner scan = new Scanner(System.in);
    
    
    String Nama_ruang;
    String Lokasi_ruang;
    String Prodi;
    int Panjang_ruang;
    int Lebar_ruang;
    int Jumlah_kursi;
    int Jumlah_meja;
    int Jumlah_jendela;
    int jumlah_pintu;
    String Username;
    String pasword;
    int Jumlahsteker;
    int kondisisteker;
    int posisisteker;
    int jumlahkabelLCD;
    int kondisikabelLCD;
    int posisikabelLCD;
    int jumlahlampu;
    int kondisilampu;
    int posisilampu;
    int jumlahkipasangin;
    int kondisikipasangin;
    int posisikipasangin;
    int jumlahAC;
    int kondisiAC;
    int posisiAC;
    int SSID;
    int bandwidth;
    int jumlahCCTV;
    int kondisiCCTV;
    int posisiCCTV;
    int kebisingan;
    int bau;
    int kebocoran;
    int keausan;
    int kerusakan;
    int kekokohan;
    int kunci_pintu;
    int kunci_jendela;
    int bahaya;
    int lantai;
    int dinding;
    int atap;
    int pintu;
    int jendela;
    int sirkulasi_udara;
    int pencayahan;
    int kelembapan;
    int suhu;
    String kondisi;
    int a;
    int b;
    int c;
    
    public Ruangan(String kondisi) {//Konstraktor
        this.kondisi = kondisi;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    
    public void setFasilitas (int kondisisteker, int kondisikabelLCD, int kondisilampu, int kondisikipasangin, int kondisiAC, int kondisiCCTV){
        this.kondisisteker=kondisisteker;
        this.kondisikabelLCD=kondisikabelLCD;
        this.kondisilampu= kondisilampu;
        this.kondisikipasangin=kondisikipasangin;
        this.kondisiAC=kondisiAC;
        this.kondisiCCTV=kondisiCCTV;
    }
    public void setFasilitas (int posisikabelLCD, int posisilampu, int posisikipasangin, int posisiAC){
        this.posisikabelLCD=posisikabelLCD;
        this.posisilampu=posisilampu;
        this.posisikipasangin=posisikipasangin;
        this.posisiAC=posisiAC;
    }
    public void setFasilitas(String username, String pasword){
        this.Username=username;
        this.pasword=pasword;
    }
    public void setKondisiLingkungan(int lantai, int dinding, int atap, int pintu, int jendela){//overloading
        this.atap=atap;
        this.dinding=dinding;
        this.lantai=lantai;
        this.jendela=jendela;
        this.pintu=pintu;
    }
    public void setKondisiLingkungan(int sirkulasi_udara){
        this.sirkulasi_udara=sirkulasi_udara;
    }
    public void setKondisiKenyamanan(int kebisingan, int bau, int kebocoran, int kerusakan, int keausan){
        this.kebisingan=kebisingan;
        this.bau=bau;
        this.kebocoran=kebocoran;
        this.kerusakan=kerusakan;
        this.keausan=keausan;
    }
    public void setKondisiKenyamanan(int kekokohan, int kunci_pintu, int kunci_jendela, int bahaya){
        this.kekokohan=kekokohan;
        this.kunci_pintu=kunci_pintu;
        this.kunci_jendela=kunci_jendela;
        this.bahaya=bahaya;
    }
  
    abstract void manage1();
 
    
    public interface deklarasi{

        public void manage();
    }
    String Kondisi1 (){
        String pilih;
        if(a==b){
            pilih = "sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String Kondisi2 (){
        String pilih;
        if(a==b){
            pilih = "sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String Kondisi3 (){
        String pilih;
        if (a==b){
            pilih="sesuai";
        }else {
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String Kondisi4 (){
        String pilih;
        if(a==b){
            pilih = "sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String Kondisi5 (){
        String pilih;
        if(a==b){
            pilih = "sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String Kondisi6 (){
        String pilih;
        if(a==b){
            pilih = "sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String Kondisi7 (){
        String pilih;
        if(a>=b){
            pilih = "sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
}
