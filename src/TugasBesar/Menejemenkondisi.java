package TugasBesar;
import java.util.Scanner;


public class Menejemenkondisi {
    Scanner scan = new Scanner(System.in);
    void deklarasi(){
        identitas (new Kondisi_sarana(" Identitas Kelas"));
        kondisi (new Kondisi_sarana(" Kondisi Kelas"));
    }
    public void identitas(Kondisi_sarana test) {
        test.manage1();
       
    }
    public void kondisi(Kondisi_sarana test) {
        test.manage();
    }

    
}
