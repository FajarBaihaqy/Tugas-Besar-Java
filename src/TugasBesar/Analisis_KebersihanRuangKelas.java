//Febri
package TugasBesar;

public class Analisis_KebersihanRuangKelas extends KebersihanRuangKelas {
    
    @Override
    String SirkulasiUdara(){
        if(SirkulasiUdara.equalsIgnoreCase("lancar")){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return SirkulasiUdara;
    }
    
    
    @Override
    public boolean Pencahayaan(){
        if(NilaiPencahayaan >= 250 || NilaiPencahayaan <= 350){
            System.out.println("sesuai");
            return true;
        }
        else{
            System.out.println("tidak sesuai");
        return false;
        }
        
    }
    
    
    @Override
    public boolean Kelembapan(){
        if(Kelembapan >= 70 || Kelembapan <= 80){
            System.out.println("sesuai");
            return true;
        }
        else{
            System.out.println("tidak sesuai");
            return false;
        }
        
    }
    
    
    @Override
    public boolean Suhu(){
        if(Suhu >= 25 || Suhu <= 35){
            System.out.println("sesuai");
           return true;
        }
        else{
            System.out.println("tidak sesuai");
           return false;
        } 
        
    }
}
