
package TugasBesar;

public class LingkunganRuangKelas extends JumlahKondisiPosisiSarana {
    private String KondisiLantai;
    private String KondisiDinding;
    private String KondisiAtap;
    private String KondisiPintu;
    private String KondisiJendela;

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

    String Kebersihan(int KondisiLantai,int KondisiDinding,int KondisiAtap,int KondisiPintu,int KondisiJendela){
        if(KondisiLantai==1 && KondisiDinding==1 && KondisiAtap==1 && KondisiPintu==1 && KondisiJendela==1){
        return "Sesuai";
    }
        else{
        return "Tidak Sesuai";
    }
    }
}
