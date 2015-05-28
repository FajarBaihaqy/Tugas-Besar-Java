package TugasBesar;

import java.util.Scanner;

public class KondisiRuangKelas {

    int Panjang;
    int Lebar;
    int Luas;
    int JumlahKursi;
    int JumlahPintu;
    int JumlahJendela;

    Scanner b=new Scanner(System.in);

    public void masuk(String hai){
        System.out.print("Panjang        = ");
        Panjang=b.nextInt();
        System.out.print("Lebar          = ");
        Lebar=b.nextInt();
        System.out.print("Jumlah kursi   = ");
        JumlahKursi=b.nextInt();
        System.out.print("Jumlah pintu   = ");
        JumlahPintu=b.nextInt();
        System.out.print("Jumlah jendela = ");
        JumlahJendela=b.nextInt();
    }
    boolean Luas(){
        return true;
        }
}
