package TugasBesar;


public class Analisis_JumlahKondisiPosisiSarana extends JumlahKondisiPosisiSarana {
    
    //Steker
    @Override
    public boolean JumlahSteker(){
        if(JumlahSteker>=4){
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
        if(KondisiSteker.equalsIgnoreCase("baik") && JumlahSteker>=4){
            System.out.println("sesuai.");
        }
        else{
            System.out.println("tidak sesuai.");
        }
        return KondisiSteker;
    }
    
    public String PosisiSteker(){
        if(PosisiSteker.equalsIgnoreCase("dekat dosen") && JumlahSteker>=4){
            System.out.println("sesuai.");
        }
        else{
            System.out.println("tidak sesuai.");
        }
        return PosisiSteker;
    }
    
    //LCD
    @Override
    public boolean JumlahLcd(){
        if(JumlahKabelLcd>=1){
            System.out.println("sesuai.");
           return true;
        }
        else{
            System.out.println("tidak sesuai.");
           return false;
        }
    }
    
    public String KondisiLcd(){
        if(KondisiKabelLcd.equalsIgnoreCase("baik")){
            System.out.println("sesuai.");
        }
        else{
            System.out.println("tidak sesuai.");
        }
        return KondisiKabelLcd;
    }
    
    public String PosisiLcd(){
        if(PosisiKabelLcd.equalsIgnoreCase("dekat dosen")){
            System.out.println("sesuai.");
        }
        else{
            System.out.println("tidak sesuai.");
        }
        return PosisiKabelLcd;
    }
    
    //Lampu
    @Override
    public boolean JumlahLampu(){
        if(JumlahLampu>=18){
            System.out.println("sesuai");
           return true;
        }
        else{
            System.out.println("tidak sesuai");
           return false;
        }
    }
    
    public String KondisiLampu(){
        if(KondisiLampu.equalsIgnoreCase("baik")&& JumlahLampu==18){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return KondisiLampu;
    }
    
    public String PosisiLampu(){
        if(PosisiLampu.equalsIgnoreCase("atap ruangan")){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return PosisiLampu;
    }
    
    //Kipas angin
    @Override
    public boolean JumlahKipas(){
        if(JumlahKipas>=2){
            System.out.println("sesuai.");
           return true;
        }
        else{
            System.out.println("tidak sesuai.");
           return false;
        }
    }
    
    public String KondisiKipas(){
        if(KondisiKipas.equalsIgnoreCase("baik")&& JumlahKipas==2){
            System.out.println("sesuai.");
        }
        else{
            System.out.println("tidak sesuai.");
        }
        return KondisiKipas;
    }
    
    public String PosisiKipas(){
        if(PosisiKipas.equalsIgnoreCase("atap ruangan")){
            System.out.println("sesuai.");
        }
        else{
            System.out.println("tidak sesuai.");
        }
        return PosisiKipas;
    }
    
    //AC
    @Override
    public boolean JumlahAc(){
        if(JumlahAc>=1){
            System.out.println("sesuai.");
           return true;
        }
        else{
            System.out.println("tidak sesuai.");
           return false;
        }
    }
    
    public String KondisiAc(){
        if(KondisiAc.equalsIgnoreCase("baik")){
            System.out.println("sesuai.");
        }
        else{
            System.out.println("tidak sesuai.");
        }
        return KondisiAc;
    }
    
    public String PosisiAc(){
        if(PosisiAc.equalsIgnoreCase("disamping") || PosisiAc.equalsIgnoreCase("dibelakang")){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai.");
        }
        return PosisiAc;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String Ssid(){
        if(Ssid.equals("UMM Hotspot")){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return Ssid;
    }
    
    public boolean Bandwidth(){
        if(Bandwidth==1 && Ssid.equals("UMM Hotspot")){
            System.out.println("sesuai");
            return true;
        }
        else{
            System.out.println("tidak sesuai");
        }
        return false;
    }
    
    //CCTV
    @Override
    public boolean JumlahCctv(){
        if(JumlahCctv==2){
            System.out.println("sesuai");
            return true;
        }
        else{
            System.out.println("tidak sesuai");   
        }
        return false;
    }
    
    public String KondisiCctv(){
        if(KondisiCctv.equalsIgnoreCase("baik")&&JumlahCctv==2){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return KondisiCctv;
    }
    
    public String PosisiCctv(){
        if(PosisiCctv.equalsIgnoreCase("depan")||PosisiCctv.equalsIgnoreCase("belakang")){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return PosisiCctv;
    }
}
