
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
        if(Kekokohan.equalsIgnoreCase("kokoh")){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return null;
        
    }
    
    String KunciPintuJendela(String KunciPintuJendela){
        if(KunciPintuJendela.equalsIgnoreCase("ada")){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return null;
    }
    
    String Bahaya(String Bahaya){
        if(Bahaya.equalsIgnoreCase("aman")){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return null;
    }
}
