
package TugasBesar;

public class JumlahKondisiPosisiSarana extends Input {
    
    String Kelistrikan(int jumlahSteker, int KondisiSteker, int PosisiSteker){
    if(jumlahSteker >= 4 && KondisiSteker == 1 && PosisiSteker ==1){
        return "sesuai";
    }

    else {
        return "tidak sesuai";
    }
        
}
    
    String Lcd (int JumlahKabelLcd, int KondisiKabelLcd, int PosisiKabelLcd){
        if(JumlahKabelLcd >= 1 && KondisiKabelLcd == 2 && PosisiKabelLcd == 1){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai";
        }
        
        
    }
    
    String Lampu (int JumlahLampu, int KondisiLampu, int PosisiLampu){
        if(JumlahLampu >= 18 && KondisiLampu == 2 && PosisiLampu == 1 ){
            return "Sesuai";
        }
        
        else{
            return "Tidak Sesuai";
        }

    }
    
    String KipasAngin(int JumlahKipas, int KondisiKipas,int PosisiKipas){
        if(JumlahKipas >= 2 && KondisiKipas ==3 && PosisiKipas ==2){
            return "Sesuai";
        }
        
        else{
            return  "Tidak Sesuai";
        }
        
    }
    
    String Ac(int JumlahAc,int KondisiAc,int PosisiAc){
        if(JumlahAc >= 1 && KondisiAc ==1 && PosisiAc ==2){
            return "Sesuai";
        }
        
        else{
            return "Tidak Sesuai";
        }
        
    }
    
    String Internet(int Ssid,int Bandwidth){
        if(Ssid ==1 && Bandwidth ==2){
            return "Sesuai";
        }
        
        else{
            return "Tidak Sesuai";
        }
        
    }
    
    String Cctv(int jumlahCctv,int KondisiCctv,int PosisiCctv){
        if(jumlahCctv ==2 && KondisiCctv ==2 && PosisiCctv ==1){
            return "Sesuai";
        }
        
        
        else{
            return "Sesuai";
        }
        
    }
}
