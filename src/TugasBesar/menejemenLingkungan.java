package TugasBesar;

import java.util.Scanner;


public class menejemenLingkungan {
    Scanner scan = new Scanner(System.in);
    void deklarasi (){
        deklarasi_lingkungan (new Lingkungan(" Kondisi Lingkungan"));
        deklarasi_kebersihan (new Lingkungan("Kondisi Kebersihan"));
    }    

    public void deklarasi_lingkungan(Lingkungan test) {
        test.manage1();
    }
    private void deklarasi_kebersihan(Lingkungan test) {        
        test.manage();
    }
}
