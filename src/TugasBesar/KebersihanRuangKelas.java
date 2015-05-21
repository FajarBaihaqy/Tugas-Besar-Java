
package TugasBesar;

public class KebersihanRuangKelas extends Input {
    
    String SirkulasiUdara(String SirkulasiUdara){
        if("lancar".equalsIgnoreCase(SirkulasiUdara)){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai";
        }
        
    }
    
    String Pencahayaan(int NilaiPencahayaan){
        if(NilaiPencahayaan >= 250 || NilaiPencahayaan <= 350){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai";
        }
        
    }
    
    String Kelembapan(int Kelembapan){
        if(Kelembapan >= 70 || Kelembapan <= 80){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai";
        }
        
    }
    
    String Suhu(int Suhu){
        if(Suhu >= 25 || Suhu <= 35){
           return "Sesuai";
        }
        else{
           return "Tidak Sesuai";
        } 
        
    }
}
