
package TugasBesar;

public class KenyamananRuangKelas extends KebersihanRuangKelas {
    private String Kebisingan;
    private String Bau;
    private String Kebocoran;
    private String Kerusakan;
    private String Keausan;

    public String getKebisingan() {
        return Kebisingan;
    }

    public void setKebisingan(String Kebisingan) {
        this.Kebisingan = Kebisingan;
    }

    public String getBau() {
        return Bau;
    }

    public void setBau(String Bau) {
        this.Bau = Bau;
    }

    public String getKebocoran() {
        return Kebocoran;
    }

    public void setKebocoran(String Kebocoran) {
        this.Kebocoran = Kebocoran;
    }

    public String getKerusakan() {
        return Kerusakan;
    }

    public void setKerusakan(String Kerusakan) {
        this.Kerusakan = Kerusakan;
    }

    public String getKeausan() {
        return Keausan;
    }

    public void setKeausan(String Keausan) {
        this.Keausan = Keausan;
    }

    String Kebisingan(int Kebisingan){
        if(Kebisingan ==0){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai";
        }
        
    }
    
    String Bau(int Bau){
        if(Bau ==0){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai";
        }
        
    }
    
    String Kebocoran(int Kebocoran){
        if(Kebocoran ==0){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai";
        }
        
    }
    
    String Kerusakan(int Kerusakan){
        if(Kerusakan ==0){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai";
        }
        
    }
    
    String Keausan(int Keausan){
        if(Keausan ==0){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai";
        }
        
    }
}
