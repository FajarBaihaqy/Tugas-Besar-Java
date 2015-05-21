/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar;

/**
 *
 * @author Acer Aspire 4741
 */
public abstract class RuangKelas {
    private String NamaRuang;
    private String LokasiRuang;
    private String ProgramStudy;
    private int Panjang;
    private int Lebar;
    private int JumlahPintu;
    private int JumlahKursi;
    private int JumlahJendela;
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
    private String KondisiLantai;
    private String KondisiDinding;
    private String KondisiAtap;
    private String KondisiPintu;
    private String KondisiJendela;
    private String SirkulasiUdara;
    private int NilaiPencahayaan;
    private int Kelembapan;
    private int Suhu;
    private String Kebisingan;
    private String Bau;
    private String Kebocoran;
    private String Kerusakan;
    private String Keausan;
    private String Kekokohan;
    private String KunciPintuJendela;
    private String Bahaya;


    
    public String getNamaRuang() {
        return NamaRuang;
    }

    public void setNamaRuang(String NamaRuang) {
        this.NamaRuang = NamaRuang;
    }

    public String getLokasiRuang() {
        return LokasiRuang;
    }

    public void setLokasiRuang(String LokasiRuang) {
        this.LokasiRuang = LokasiRuang;
    }

    public String getProgramStudy() {
        return ProgramStudy;
    }

    public void setProgramStudy(String ProgramStudy) {
        this.ProgramStudy = ProgramStudy;
    }

    public int getPanjang() {
        return Panjang;
    }

    public void setPanjang(int Panjang) {
        this.Panjang = Panjang;
    }

    public int getLebar() {
        return Lebar;
    }

    public void setLebar(int Lebar) {
        this.Lebar = Lebar;
    }

    public int getJumlahPintu() {
        return JumlahPintu;
    }

    public void setJumlahPintu(int JumlahPintu) {
        this.JumlahPintu = JumlahPintu;
    }

    public int getJumlahKursi() {
        return JumlahKursi;
    }

    public void setJumlahKursi(int JumlahKursi) {
        this.JumlahKursi = JumlahKursi;
    }

    public int getJumlahJendela() {
        return JumlahJendela;
    }

    public void setJumlahJendela(int JumlahJendela) {
        this.JumlahJendela = JumlahJendela;
    }

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

    public String getKondisiLantai() {
        return KondisiLantai;
    }

    public void setKondisiLantai(String KondisiLantai) {
        this.KondisiLantai = KondisiLantai;
    }

    public String getKondisiDinding() {
        return KondisiDinding;
    }

    public void setKondisiDinding(String KondisiDinding) {
        this.KondisiDinding = KondisiDinding;
    }

    public String getKondisiAtap() {
        return KondisiAtap;
    }

    public void setKondisiAtap(String KondisiAtap) {
        this.KondisiAtap = KondisiAtap;
    }

    public String getKondisiPintu() {
        return KondisiPintu;
    }

    public void setKondisiPintu(String KondisiPintu) {
        this.KondisiPintu = KondisiPintu;
    }

    public String getKondisiJendela() {
        return KondisiJendela;
    }

    public void setKondisiJendela(String KondisiJendela) {
        this.KondisiJendela = KondisiJendela;
    }

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
}
