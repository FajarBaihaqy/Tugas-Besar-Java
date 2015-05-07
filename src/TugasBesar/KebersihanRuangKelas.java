
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
        if(SirkulasiUdara.equalsIgnoreCase("lancar")){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return null;
    }
    
    int Pencahayaan(int NilaiPencahayaan){
        if(NilaiPencahayaan >= 250 || NilaiPencahayaan <= 350){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return 0;
    }
    
    int Kelembapan(int Kelembapan){
        if(Kelembapan >= 70 || Kelembapan <= 80){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return 0;
    }
    
    int Suhu(int Suhu){
        if(Suhu >= 25 || Suhu <= 35){
           System.out.println("Sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        } 
        return 0;
        
    }
}
