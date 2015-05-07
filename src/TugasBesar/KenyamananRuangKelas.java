
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

    String Kebisingan(String Kebisingan){
        if(Kebisingan.equalsIgnoreCase("tidak bising")){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return null;
    }
    
    String Bau(String Bau){
        if(Bau.equalsIgnoreCase("tidak bau")){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return null;
    }
    
    String Kebocoran(String Kebocoran){
        if(Kebocoran.equalsIgnoreCase("tidak bocor")){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return null;
        
    }
    
    String Kerusakan(String Kerusakan){
        if(Kerusakan.equalsIgnoreCase("tidak rusak")){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return null;
        
    }
    
    String Keausan(String Keausan){
        if(Keausan.equalsIgnoreCase("tidak aus")){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return null;
        
    }
}
