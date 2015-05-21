
package TugasBesar;

public class KeamananRuangKelas extends Input {
     
    String Kekokohan(String Kekokohan){
        if("kokoh".equalsIgnoreCase(Kekokohan)){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai";
        }
        
    }
    
    String KunciPintuJendela(String KunciPintuJendela){
        if("ada".equalsIgnoreCase(KunciPintuJendela)){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai";
        }
        
    }
    
    String Bahaya(String Bahaya){
        if("Aman".equalsIgnoreCase(Bahaya)){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai";
        }
        
    }
}
