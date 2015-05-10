
package TugasBesar;

public class KebersihanRuangKelas extends LingkunganRuangKelas {
    private String SirkulasiUdara;
    private int NilaiPencahayaan;
    private int Kelembapan;
    private int Suhu;

    public String getSirkulasiUdara() {
        return SirkulasiUdara;
    }

    public void setSirkulasiUdara(String SirkulasiUdara) {
        this.SirkulasiUdara = SirkulasiUdara;
    }

    public int getNilaiPencahayaan() {
        return NilaiPencahayaan;
    }

    public void setNilaiPencahayaan(int NilaiPencahayaan) {
        this.NilaiPencahayaan = NilaiPencahayaan;
    }

    public int getKelembapan() {
        return Kelembapan;
    }

    public void setKelembapan(int Kelembapan) {
        this.Kelembapan = Kelembapan;
    }

    public int getSuhu() {
        return Suhu;
    }

    public void setSuhu(int Suhu) {
        this.Suhu = Suhu;
    }

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
