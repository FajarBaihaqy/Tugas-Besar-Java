package TugasBesar;

public class Analisis_KondisiRuangKelas extends KondisiRuangKelas {
    @Override
    public boolean Luas(){
        int luas=Panjang*Lebar;
        System.out.println("\tLuas Kelas = "+luas+" meter.");
        if(Panjang!=Lebar){
            System.out.println("sesuai");
            return true;
        }
        else{
            System.out.println("tidak sesuai");
            return false;
        }
        }
    
    public boolean rasioluas(){
        int luas=Panjang*Lebar;
        int rasio=luas/JumlahKursi;
        System.out.print("\tRasio luas = "+rasio);
        if(rasio>=0.5){
            System.out.println("sesuai");
            return true;
        }
        else{
            System.out.println("tidak sesuai.");
            return false;
        }
        }
    public boolean jmlpintu(){
        if(JumlahPintu>=2){
            System.out.println("sesuai.");
            return true;
        }
        else{
            System.out.println("tidak sesuai");
            return false;
        }
    }
    
    public boolean jmljendela(){
        if(JumlahJendela>=2){
            System.out.println("sesuai");
            return true;
        }
        else{
            System.out.println("tidak sesuai");
            return false;
        }
    }
}
