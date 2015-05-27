package TugasBesar;

public class Analisis_LingkunganRuangKelas extends LingkunganRuangKelas {

@Override
public String lantai(){
        if(KondisiLantai.equalsIgnoreCase("bersih")){
            System.out.println("\tKondisi lantai sesuai.");
        }
        else{
            System.out.println("\tKondisi lantai tidak sesuai.");
        }
        return KondisiLantai;
    }
    
    public String dinding(){
        if(KondisiDinding.equalsIgnoreCase("bersih")){
            System.out.println("\tKondisi dinding sesuai.");
        }
        else{
            System.out.println("\tKondisi dinding tidak sesuai.");
        }
        return KondisiDinding;
    }
    
    public String atap(){
        if(KondisiAtap.equalsIgnoreCase("bersih")){
            System.out.println("\tKondisi atap sesuai.");
        }
        else{
            System.out.println("\tKondisi atap tidak sesuai.");
        }
        return KondisiAtap;
    }
    
    public String pintu(){
        if(KondisiPintu.equalsIgnoreCase("bersih")){
            System.out.println("\tKondisi pintu sesuai.");
        }
        else{
            System.out.println("\tKondisi pintu tidak sesuai.");
        }
        return KondisiPintu;
    }
    
    public String jendela(){
        if(KondisiJendela.equalsIgnoreCase("bersih")){
            System.out.println("\tKondisi jendela sesuai.");
        }
        else{
            System.out.println("\tKondisi jendela tidak sesuai.");
        }
        return KondisiJendela;
    }
    
@Override
    public String semua(){
        if(KondisiLantai.equalsIgnoreCase("bersih")&&KondisiDinding.equalsIgnoreCase("bersih")&&KondisiAtap.equalsIgnoreCase("bersih")&&KondisiPintu.equalsIgnoreCase("bersih")&&KondisiJendela.equalsIgnoreCase("bersih")){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return null;
    }    
}
