package TugasBesar;

import TugasBesar.Ruangan.deklarasi;

public class Lingkungan extends Ruangan implements deklarasi{
    int Atap;
    int Dinding;
    int Jendela;
    int Pintu;
    int Lantai;
    int Sirkulasi;
    public Lingkungan(String kondisi) {//konstraktor
        super(kondisi);
    }
    
    @Override//override
    public void setKondisiLingkungan(int lantai, int dinding, int atap, int pintu, int jendela) {
        super.setKondisiLingkungan(lantai, dinding, atap, pintu, jendela);
    }

    @Override//override
    public void setKondisiLingkungan(int sirkulasi_udara) {
        super.setKondisiLingkungan(sirkulasi_udara);
    }
    
    
    //enkapsulasi
    public int getPilih_atap() {
        return Atap;
    }

    public void setPilih_atap(int pilih_atap) {
        this.Atap = pilih_atap;
    }

    public int getPilih_dinding() {
        return Dinding;
    }

    public void setPilih_dinding(int pilih_dinding) {
        this.Dinding = pilih_dinding;
    }

    public int getPilih_jendela() {
        return Jendela;
    }

    public void setPilih_jendela(int pilih_jendela) {
        this.Jendela = pilih_jendela;
    }

    public int getPilih_pintu() {
        return Pintu;
    }

    public void setPilih_pintu(int pilih_pintu) {
        this.Pintu = pilih_pintu;
    }

    public int getPilih_lantai() {
        return Lantai;
    }

    public void setPilih_lantai(int pilih_lantai) {
        this.Lantai = pilih_lantai;
    }

    public int getPilih_sirkulasi() {
        return Sirkulasi;
    }

    public void setPilih_sirkulasi(int pilih_sirkulasi) {
        this.Sirkulasi = pilih_sirkulasi;
    }
    
    public int getPencayahan() {
        return pencayahan;
    }

    public void setPencayahan(int pencayahan) {
        this.pencayahan = pencayahan;
    }

    public int getKelembapan() {
        return kelembapan;
    }

    public void setKelembapan(int kelembapan) {
        this.kelembapan = kelembapan;
    }

    public int getSuhu() {
        return suhu;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }
    

    @Override
    void manage1() {
        setKondisiLingkungan(1, 1, 1, 1, 1);
        System.out.println(kondisi);
        System.out.println("=============================");
        System.out.println("||  Kondisi Lantai          ||");
        System.out.println("||  1. bersih               ||");
        System.out.println("||  2. tidak bersih         ||");
        System.out.print("Jawab : ");
        setPilih_lantai(scan.nextInt());
        System.out.println("||  Kondisi lantai :"+Kondisi1());
        
        System.out.println("====================================");
        System.out.println("||  keaadaan dinding              ||");
        System.out.println("||  1. bersih                     ||");
        System.out.println("||  2. tidak bersih               ||");
        System.out.print("Jawab : ");
        setPilih_dinding(scan.nextInt());
        System.out.println("||  Kondisi dinding :"+Kondisi2    ());
        
        System.out.println("====================================");        
        System.out.println("|| keaadaan atap                  ||");
        System.out.println("|| 1. bersih                      ||");
        System.out.println("|| 2. tidak bersih                ||");
        System.out.print("Jawab : ");  
        setPilih_atap(scan.nextInt());
        System.out.println("||  Kondisi atap :"+Kondisi3());
        
        System.out.println("====================================");
        System.out.println("|| keaadaan pintu                 ||");
        System.out.println("|| 1. bersih                      ||");
        System.out.println("|| 2. tidak bersih                ||");
        System.out.print("Jawab : ");
        setPilih_pintu(scan.nextInt());
        System.out.println("|| Kondisi pintu :"+Kondisi4());
        
        System.out.println("====================================");
        System.out.println("|| keaadaan jendela               ||");
        System.out.println("|| 1. bersih                      ||");
        System.out.println("|| 2. tidak bersih                ||");
        System.out.print("Jawab : ");
        setPilih_jendela(scan.nextInt());
        System.out.println("|| Kondisi jendela :"+Kondisi5());
    }

    @Override
    public void manage() {
        System.out.println(kondisi);
        setKondisiLingkungan(1);
        System.out.println("====================================");
        System.out.println("|| sirkulasi udara kelas          ||");
        System.out.println("|| 1. lancar                      ||");
        System.out.println("|| 2. tidak lancar                ||");
        System.out.print("Jawab : ");
        setPilih_sirkulasi(scan.nextInt());
        System.out.println("|| Sirkulasi udara : "+Kondisi6());
        
        System.out.println("====================================");
        System.out.println("|| nilai pencayahan kelas");
        System.out.print("jawab : ");
        setPencayahan(scan.nextInt());
        System.out.println("|| Pencayahan :"+pencayahan());
                
        System.out.println("|| nilai kelembapan kelas");
        System.out.print("jawab : ");
        setKelembapan(scan.nextInt());
        System.out.println("|| Kelembapan :"+kelembapan());
        System.out.print("jawab : ");
        System.out.println("|| nilai suhu ruangan");
        System.out.print("jawab : ");
        setSuhu(scan.nextInt());
        System.out.println("|| Suhu :"+suhu());
    }
    
    
    
    @Override
    String Kondisi1() {   //kebersihan lantai   
        a=getPilih_lantai();
        b=lantai;
        return super.Kondisi1();
    }

    @Override
    String Kondisi2() {//kebersihan dinding
        a=getPilih_dinding();
        b=dinding;
        return super.Kondisi2();
    }
    
    @Override
    String Kondisi3() {//kebersihan atap
        a=getPilih_atap();
        b=atap;
        return super.Kondisi3();
    }

    @Override
    String Kondisi4() {// kebersihan pintu
        a=getPilih_pintu();
        b=pintu;
        return super.Kondisi4();
    }

    @Override
    String Kondisi5() {//kebersihan jendela
        a=getPilih_jendela();
        b=jendela;
        return super.Kondisi5();
    }

    @Override
    String Kondisi6() {//sirkulasi udara
        a=getPilih_sirkulasi();
        b=sirkulasi_udara;
        return super.Kondisi6();
    }
    
    String pencayahan(){
        String pilih;
        if(getPencayahan()>=250 && getPencayahan()<=350){
            pilih = "sesuai";
        }else{
            pilih = "tidak sesuai";
        }
        return pilih;
    }
    String kelembapan(){
        String pilih;
        if(getKelembapan()>=70 && getKelembapan()<=80){
            pilih="sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
    String suhu(){
        String pilih;
        if(getSuhu()>=25 && getSuhu()<=35){
            pilih = "sesuai";
        }else{
            pilih="tidak sesuai";
        }
        return pilih;
    }
}
