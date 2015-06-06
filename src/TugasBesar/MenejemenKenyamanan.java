package TugasBesar;
import java.util.Scanner;

public class MenejemenKenyamanan {
    Scanner scan = new Scanner(System.in);
    void deklarasi(){
        Menejemen_kenyamanan(new Kenyamanan(" Kondisi Kenyamanan"));
        Menejemen_keamanan(new Kenyamanan(" Kondisi Keamanan"));      
    }
    public void Menejemen_kenyamanan(Kenyamanan test) {
        test.manage1();
    }
    public void Menejemen_keamanan(Kenyamanan test) {
        test.manage();
    }
}
