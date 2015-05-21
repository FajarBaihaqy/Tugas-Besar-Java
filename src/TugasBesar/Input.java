/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer Aspire 4741
 */
public class Input extends RuangKelas {
    String NamaRuang(String NamaRuang){
        JOptionPane.showInputDialog("Masukkan Nama Ruang : ");
        
        return null;

    }
    
    String LokasiRuang(String LokasiRuang){
        JOptionPane.showInputDialog("Masukkan Lokasi Ruang : ");
        return null;
        
    }
    
    String ProgramStudy(String ProgramStudy){
        JOptionPane.showInputDialog("Masukkan Program Study : ");
        return null;
        
    }

    int LuasRuangan(int Panjang, int Lebar){
        String inputP = JOptionPane.showInputDialog("Masukkan Panjang : ");
        int P =Integer.parseInt(inputP);
        String inputL = JOptionPane.showInputDialog("Masukkan Lebar : ");
        int L =Integer.parseInt(inputL);
        return 0;
    
}
    

    String BentukRuang(int Panjang, int Lebar) {
        String inputP = JOptionPane.showInputDialog("Masukkan Panjang : ");
        int P =Integer.parseInt(inputP);
        String inputL = JOptionPane.showInputDialog("Masukkan Lebar : ");
        int L =Integer.parseInt(inputL);
        return null;
        
    }
    

    String RasioLuas(int LuasRuang, int JumlahKursi) {
        String inputLR = JOptionPane.showInputDialog("Masukkan Luas Ruangan : ");
        int LR =Integer.parseInt(inputLR);
        String inputJK = JOptionPane.showInputDialog("Masukkan jumlah kursi : ");
        int JK =Integer.parseInt(inputJK);
        return null;
       

    }
    

    String Pintu_Jendela(int JumlahPintu, int JumlahJendela) {
        String inputJP = JOptionPane.showInputDialog("Masukkan Luas Ruangan : ");
        int JP =Integer.parseInt(inputJP);
        String inputJJ = JOptionPane.showInputDialog("Masukkan jumlah kursi : ");
        int JJ =Integer.parseInt(inputJJ);
        return null;


    }
    

    String Kelistrikan(int jumlahSteker, int KondisiSteker, String PosisiSteker){
        String inputJS = JOptionPane.showInputDialog("Masukkan Luas Ruangan : ");
        int JS =Integer.parseInt(inputJS);
        String inputKS = JOptionPane.showInputDialog("Masukkan jumlah kursi : ");
        int KS =Integer.parseInt(inputKS);
        String inputPS = JOptionPane.showInputDialog("Posisi Steker : ");
        return null;
    
        
}
    

    String Lcd (int JumlahKabelLcd, int KondisiKabelLcd, int PosisiKabelLcd){
        String inputJumlah = JOptionPane.showInputDialog("Masukkan jumlah kabel LCD : ");
        int Jumlah =Integer.parseInt(inputJumlah);
        String inputKondisi = JOptionPane.showInputDialog("Kondisi kabel LCD : ");
        int Kondisi =Integer.parseInt(inputKondisi);
        String inputPosisi = JOptionPane.showInputDialog("Posisi kabel LCD : ");
        return null;
        
        
        
    }
    

    String Lampu (int JumlahLampu, int KondisiLampu, int PosisiLampu){
        String inputJumlah = JOptionPane.showInputDialog("Masukkan jumlah lampu : ");
        int Jumlah =Integer.parseInt(inputJumlah);
        String inputKondisi = JOptionPane.showInputDialog("Kondisi lampu : ");
        int Kondisi =Integer.parseInt(inputKondisi);
        String inputPosisi = JOptionPane.showInputDialog("Posisi lampu : ");
        return null;
        

    }
    

    String KipasAngin(int JumlahKipas, int KondisiKipas,int PosisiKipas){
        String inputJumlah = JOptionPane.showInputDialog("Masukkan jumlah kipas : ");
        int Jumlah =Integer.parseInt(inputJumlah);
        String inputKondisi = JOptionPane.showInputDialog("Kondisi kipas : ");
        int Kondisi =Integer.parseInt(inputKondisi);
        String inputPosisi = JOptionPane.showInputDialog("Posisi kipas : ");
        return null;
        
        
    }
    

    String Ac(int JumlahAc,int KondisiAc,int PosisiAc){
        String inputJumlah = JOptionPane.showInputDialog("Masukkan jumlah AC : ");
        int Jumlah =Integer.parseInt(inputJumlah);
        String inputKondisi = JOptionPane.showInputDialog("Kondisi AC : ");
        int Kondisi =Integer.parseInt(inputKondisi);
        String inputPosisi = JOptionPane.showInputDialog("Posisi AC : ");
        return null;
        
        
    }
    

    String Internet(String Ssid,int Bandwidth){
        String inputSsid = JOptionPane.showInputDialog("Masukkan SSID : ");
        String inputBanwidth = JOptionPane.showInputDialog("Masukkan Bandwidth : ");
        int Bandwith = Integer.parseInt(inputBanwidth);
        return null;
        
        
    }
    

    String Cctv(int jumlahCctv,int KondisiCctv,int PosisiCctv){
        String inputJumlah = JOptionPane.showInputDialog("Masukkan jumlah CCTV : ");
        int Jumlah =Integer.parseInt(inputJumlah);
        String inputKondisi = JOptionPane.showInputDialog("Kondisi CCTV : ");
        int Kondisi =Integer.parseInt(inputKondisi);
        String inputPosisi = JOptionPane.showInputDialog("Posisi CCTV : ");
        return null;
        
    }
    
    String Kebersihan(int KondisiLantai,int KondisiDinding,int KondisiAtap,int KondisiPintu,int KondisiJendela){
        String inputLantai = JOptionPane.showInputDialog("Kondisi Lantai : ");
        String inputDinding = JOptionPane.showInputDialog("Kondisi dinding : ");
        String inputAtap = JOptionPane.showInputDialog("Kondisi atap : ");
        String inputPintu = JOptionPane.showInputDialog("Kondisi pintu : ");
        String inputJendela = JOptionPane.showInputDialog("Kondisi jendela : ");
        return null;
        
    }
    
    String SirkulasiUdara(String SirkulasiUdara){
        JOptionPane.showInputDialog("Sirkulasi udara : ");
        return null;
    }
    
    String Pencahayaan(int NilaiPencahayaan){
        JOptionPane.showInputDialog("Pencahayaan : ");
        return null;
    }
    
    String Kelembapan(int Kelembapan){
        String input = JOptionPane.showInputDialog("Kelembapan : ");
        int lembap = Integer.parseInt(input);
        return null;
    }
    
    String Suhu(int Suhu){
        String input = JOptionPane.showInputDialog("Suhu : ");
        int suhu = Integer.parseInt(input);
        return null;

    }
    
    String Kebisingan(int Kebisingan){
     String input = JOptionPane.showInputDialog("Kebisingan : ");    
        return null;
    }
    
    String Bau(int Bau){
    String input = JOptionPane.showInputDialog("Bau : ");
        return null;
        
    }
    
    String Kebocoran(int Kebocoran){
        String input = JOptionPane.showInputDialog("Kebocoran : ");
        return null;
    }
    
    String Kerusakan(int Kerusakan){
        String input = JOptionPane.showInputDialog("Kerusakan : ");
        return null;
    }
    
    String Keausan(int Keausan){
        String input = JOptionPane.showInputDialog("Keausan : ");  
        return null;
    }
    
    String Kekokohan(String Kekokohan){
        String input = JOptionPane.showInputDialog("Kekokohan : ");  
        return null;
        
    }
    
    String KunciPintuJendela(String KunciPintuJendela){
        String input = JOptionPane.showInputDialog("Kunci Pintu dan Jendela : ");  
        return null;
        
    }
    
    String Bahaya(String Bahaya){
        String input = JOptionPane.showInputDialog("Bahaya : ");  
        return null;
        
    }
}
