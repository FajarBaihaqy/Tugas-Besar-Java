
package TugasBesar;

import java.util.Scanner;



public class IdentitasRuangKelas {
    private String NamaRuang;
    private String LokasiRuang;
    private String ProgramStudy;

    public String getNamaRuang() {
        return NamaRuang;
    }

    public void setNamaRuang(String NamaRuang) {
        this.NamaRuang = NamaRuang;
    }

    public String getLokasiRuang() {
        return LokasiRuang;
    }

    public void setLokasi(String LokasiRuang) {
        this.LokasiRuang = LokasiRuang;
    }

    public String getProgramStudy() {
        return ProgramStudy;
    }

    public void setProgramStudy(String ProgramStudy) {
        this.ProgramStudy = ProgramStudy;
    }
    
    
      
    Scanner a=new Scanner(System.in);
    public void identitas(){
        
        System.out.print("Nama ruang = ");
        setNamaRuang(a.next());
        System.out.print("Lokasi ruang = ");
        setLokasi(a.next());
        System.out.print("Program Study = ");
        setProgramStudy(a.next());
        
        System.out.println(getNamaRuang()+" "+getLokasiRuang()+" "+getProgramStudy());
    }
}
