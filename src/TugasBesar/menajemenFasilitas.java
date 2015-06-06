package TugasBesar;
import java.util.Scanner;


public class menajemenFasilitas {
    Scanner scan = new Scanner(System.in);
    void deklarasi (){
        analisa_sarana(new Fasilitas("Tahap Jumlah, Kondisi, Posisi Sarana"));
    }

    public void analisa_sarana(Fasilitas kondisi) {
        kondisi.manage1();
    }
}
