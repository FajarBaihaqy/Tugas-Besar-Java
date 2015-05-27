package TugasBesar;


public class Analisis_JumlahKondisiPosisiSarana extends JumlahKondisiPosisiSarana {
    
    //Steker
    @Override
    public boolean JumlahSteker(){
        if(jumlah>=4){
            System.out.println("sesuai.");
           return true;
        }
        else{
            System.out.println("tidak sesuai.");
           return false;
        }
    }
    
    
    @Override
    public String KondisiSteker(){
        if(kondisi.equalsIgnoreCase("baik") && jumlah>=4){
            System.out.println("sesuai.");
        }
        else{
            System.out.println("tidak sesuai.");
        }
        return kondisi;
    }
    
    public String PosisiSteker(){
        if(posisi.equalsIgnoreCase("dekat dosen") && jumlah>=4){
            System.out.println("sesuai.");
        }
        else{
            System.out.println("tidak sesuai.");
        }
        return posisi;
    }
    
    //LCD
    @Override
    public boolean JumlahLcd(){
        if(jumlah>=1){
            System.out.println("sesuai.");
           return true;
        }
        else{
            System.out.println("tidak sesuai.");
           return false;
        }
    }
    
    public String KondisiLcd(){
        if(kondisi.equalsIgnoreCase("baik")){
            System.out.println("sesuai.");
        }
        else{
            System.out.println("tidak sesuai.");
        }
        return kondisi;
    }
    
    public String PosisiLcd(){
        if(posisi.equalsIgnoreCase("dekat dosen")){
            System.out.println("sesuai.");
        }
        else{
            System.out.println("tidak sesuai.");
        }
        return posisi;
    }
    
    //Lampu
    @Override
    public boolean JumlahLampu(){
        if(jumlah>=18){
            System.out.println("sesuai");
           return true;
        }
        else{
            System.out.println("tidak sesuai");
           return false;
        }
    }
    
    public String KondisiLampu(){
        if(kondisi.equalsIgnoreCase("baik")&& jumlah==18){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return kondisi;
    }
    
    public String PosisiLampu(){
        if(posisi.equalsIgnoreCase("atap ruangan")){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return posisi;
    }
    
    //Kipas angin
    @Override
    public boolean JumlahKipas(){
        if(jumlah>=2){
            System.out.println("sesuai.");
           return true;
        }
        else{
            System.out.println("tidak sesuai.");
           return false;
        }
    }
    
    public String KondisiKipas(){
        if(kondisi.equalsIgnoreCase("baik")&& jumlah==2){
            System.out.println("sesuai.");
        }
        else{
            System.out.println("tidak sesuai.");
        }
        return kondisi;
    }
    
    public String PosisiKipas(){
        if(posisi.equalsIgnoreCase("atap ruangan")){
            System.out.println("sesuai.");
        }
        else{
            System.out.println("tidak sesuai.");
        }
        return posisi;
    }
    
    //AC
    @Override
    public boolean JumlahAc(){
        if(jumlah>=1){
            System.out.println("sesuai.");
           return true;
        }
        else{
            System.out.println("tidak sesuai.");
           return false;
        }
    }
    
    public String KondisiAc(){
        if(kondisi.equalsIgnoreCase("baik")){
            System.out.println("sesuai.");
        }
        else{
            System.out.println("tidak sesuai.");
        }
        return kondisi;
    }
    
    public String PosisiAc(){
        if(posisi.equalsIgnoreCase("disamping") || posisi.equalsIgnoreCase("dibelakang")){
            System.out.println("sesuai.");
        }
        else{
            System.out.println("tidak sesuai.");
        }
        return posisi;
    }
    
    
}
