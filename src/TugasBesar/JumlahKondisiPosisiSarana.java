
package TugasBesar;

public class JumlahKondisiPosisiSarana extends KondisiRuangKelas {
    private int jumlahSteker;
    private String KondisiSteker;
    private String PosisiSteker;
    private int JumlahKabelLcd;
    private String KondisiKabelLcd;
    private String PosisiKabelLcd;
    private int JumlahLampu;
    private String KondisiLampu;
    private String PosisiLampu;
    private int JumlahKipas;
    private String KondisiKipas;
    private String PosisiKipas;
    private int JumlahAc;
    private String KondisiAc;
    private String PosisiAc;
    private String Ssid;
    private int Bandwidth;
    private int jumlahCctv;
    private String KondisiCctv;
    private String PosisiCctv;

    public int getJumlahSteker() {
        return jumlahSteker;
    }

    public void setJumlahSteker(int jumlahSteker) {
        this.jumlahSteker = jumlahSteker;
    }

    public String getKondisiSteker() {
        return KondisiSteker;
    }

    public void setKondisiSteker(String KondisiSteker) {
        this.KondisiSteker = KondisiSteker;
    }

    public String getPosisiSteker() {
        return PosisiSteker;
    }

    public void setPosisiSteker(String PosisiSteker) {
        this.PosisiSteker = PosisiSteker;
    }

    public int getJumlahKabelLcd() {
        return JumlahKabelLcd;
    }

    public void setJumlahKabelLcd(int JumlahKabelLcd) {
        this.JumlahKabelLcd = JumlahKabelLcd;
    }

    public String getKondisiKabelLcd() {
        return KondisiKabelLcd;
    }

    public void setKondisiKabelLcd(String KondisiKabelLcd) {
        this.KondisiKabelLcd = KondisiKabelLcd;
    }

    public String getPosisiKabelLcd() {
        return PosisiKabelLcd;
    }

    public void setPosisiKabelLcd(String PosisiKabelLcd) {
        this.PosisiKabelLcd = PosisiKabelLcd;
    }

    public int getJumlahLampu() {
        return JumlahLampu;
    }

    public void setJumlahLampu(int JumlahLampu) {
        this.JumlahLampu = JumlahLampu;
    }

    public String getKondisiLampu() {
        return KondisiLampu;
    }

    public void setKondisiLampu(String KondisiLampu) {
        this.KondisiLampu = KondisiLampu;
    }

    public String getPosisiLampu() {
        return PosisiLampu;
    }

    public void setPosisiLampu(String PosisiLampu) {
        this.PosisiLampu = PosisiLampu;
    }

    public int getJumlahKipas() {
        return JumlahKipas;
    }

    public void setJumlahKipas(int JumlahKipas) {
        this.JumlahKipas = JumlahKipas;
    }

    public String getKondisiKipas() {
        return KondisiKipas;
    }

    public void setKondisiKipas(String KondisiKipas) {
        this.KondisiKipas = KondisiKipas;
    }

    public String getPosisiKipas() {
        return PosisiKipas;
    }

    public void setPosisiKipas(String PosisiKipas) {
        this.PosisiKipas = PosisiKipas;
    }

    public int getJumlahAc() {
        return JumlahAc;
    }

    public void setJumlahAc(int JumlahAc) {
        this.JumlahAc = JumlahAc;
    }

    public String getKondisiAc() {
        return KondisiAc;
    }

    public void setKondisiAc(String KondisiAc) {
        this.KondisiAc = KondisiAc;
    }

    public String getPosisiAc() {
        return PosisiAc;
    }

    public void setPosisiAc(String PosisiAc) {
        this.PosisiAc = PosisiAc;
    }

    public String getSsid() {
        return Ssid;
    }

    public void setSsid(String Ssid) {
        this.Ssid = Ssid;
    }

    public int getBandwidth() {
        return Bandwidth;
    }

    public void setBandwidth(int Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public int getJumlahCctv() {
        return jumlahCctv;
    }

    public void setJumlahCctv(int jumlahCctv) {
        this.jumlahCctv = jumlahCctv;
    }

    public String getKondisiCctv() {
        return KondisiCctv;
    }

    public void setKondisiCctv(String KondisiCctv) {
        this.KondisiCctv = KondisiCctv;
    }

    public String getPosisiCctv() {
        return PosisiCctv;
    }

    public void setPosisiCctv(String PosisiCctv) {
        this.PosisiCctv = PosisiCctv;
    }

    

    
    String Kelistrikan(int jumlahSteker, int KondisiSteker, String PosisiSteker){
    if(jumlahSteker >= 4){
        System.out.println("Sesuai");
    }
    
    else if(jumlahSteker < 4){
        System.out.println("Tidak Sesuai");
    }
    
    if(KondisiSteker == 4){
        System.out.println("Sesuai");
    }
    else if(KondisiSteker != 4){
        System.out.println("Tidak Sesuai");
    }
    
    if(PosisiSteker.equalsIgnoreCase("dipojok ruang") || PosisiSteker.equalsIgnoreCase("dekat dosen")){
        System.out.println("Sesuai");
    }
        return null;
}
    
    String Lcd (int JumlahKabelLcd, String KondisiKabelLcd, String PosisiKabelLcd){
        if(JumlahKabelLcd >= 1){
            System.out.println("Sesuai");
        }
        else if(JumlahKabelLcd < 1){
            System.out.println("Tidak Sesuai");
        }
        
        if(KondisiKabelLcd.equalsIgnoreCase("berfungsi")){
            System.out.println("Sesuai");
        }
        
        if(PosisiKabelLcd.equalsIgnoreCase("dekat dosen")){
           System.out.println("Sesuai");
        }
        return null;
        
    }
    
    String Lampu (int JumlahLampu, int KondisiLampu, String PosisiLampu){
        if(JumlahLampu >= 18){
            System.out.println("Sesuai");
        }
        
        if(KondisiLampu == 18){
            System.out.println("Sesuai");
        }
        
        if(PosisiLampu.equalsIgnoreCase("atap ruangan")){
            System.out.println("Sesuai");
        }
        return null;
    }
    
    String KipasAngin(int JumlahKipas, int KondisiKipas,String PosisiKipas){
        if(JumlahKipas >= 2){
            System.out.println("Sesuai");
        }
        if(KondisiKipas == 2){
            System.out.println("Sesuai");
        }
        if(PosisiKipas.equalsIgnoreCase("atap ruangan")){
            System.out.println("Sesuai");
        }
        return null;
    }
    
    String Ac(int JumlahAc,String KondisiAc,String PosisiAc){
        if(JumlahAc >= 1 ){
            System.out.println("Sesuai");
        }
        if(KondisiAc.equalsIgnoreCase("baik")){
            System.out.println("Sesuai");
        }
        if(PosisiAc.equalsIgnoreCase("dibelakang") && PosisiAc.equalsIgnoreCase("samping")){
            System.out.println("Sesuai");
        }
        return null;
    }
    
    String Internet(String Ssid,int Bandwidth){
        if(Ssid.equals("UMM Hotspot")){
            System.out.println("Sesuai");
        }
        
        if(Bandwidth == 1){
            System.out.println("Sesuai");
        }
        return null;
    }
    
    String Cctv(int jumlahCctv,int KondisiCctv,String PosisiCctv){
        if(jumlahCctv == 2){
            System.out.println("Sesuai");
        }
        
        if(KondisiCctv == 2){
            System.out.println("Sesuai");
        }
        if(PosisiCctv.equalsIgnoreCase("depan") && PosisiCctv.equalsIgnoreCase("belakang")){
            System.out.println("Sesuai");
        }
        return null;
    }
}
