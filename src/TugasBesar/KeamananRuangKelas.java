
package TugasBesar;

public class KeamananRuangKelas extends KenyamananRuangKelas {
    private String Kekokohan;
    private String KunciPintuJendela;
    private String Bahaya; 

    public String getKekokohan() {
        return Kekokohan;
    }

    public void setKekokohan(String Kekokohan) {
        this.Kekokohan = Kekokohan;
    }

    public String getKunciPintuJendela() {
        return KunciPintuJendela;
    }

    public void setKunciPintuJendela(String KunciPintuJendela) {
        this.KunciPintuJendela = KunciPintuJendela;
    }

    public String getBahaya() {
        return Bahaya;
    }

    public void setBahaya(String Bahaya) {
        this.Bahaya = Bahaya;
    }

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
