package TugasBesar;

public abstract class Masukan extends Ruangan {

    public Masukan(String kondisi) {
        super(kondisi);
    }

    

    

    @Override
    abstract void manage1();
    abstract void manage();
    abstract String tampil();
    
    @Override
    abstract String Kondisi1();


    @Override
    abstract String Kondisi2();

    @Override
    abstract String Kondisi3();


    @Override
    abstract String Kondisi4();


    @Override
    abstract String Kondisi5();


    @Override
    abstract String Kondisi6();
    
    abstract String JumlahSteker ();
    
    abstract String posisiSteker ();
    abstract String JumlahKabelLCD();
    abstract String PosisiKabelLCD();
    abstract String JumlahLampu();
    abstract String PosisiLampu();
    abstract String JumlahKipasAngin();
    abstract String PosisiKipasAngin();
    abstract String JumlahAC();
    abstract String PosisiAC();
    abstract String JumlahCCTV();
    abstract String PosisiCCTV();
    abstract String SSID();
    abstract String loginusername();
    abstract String loginpasword();
    abstract String kunci();
    
    abstract double luas ();
    abstract String bentuk();
    
    abstract double rasio();
    abstract String analisisPintuDanJendela();
    abstract String Analisis_rasio();
    
    abstract String pencayahan();
    abstract String kelembapan();
    abstract String suhu();

    
}
