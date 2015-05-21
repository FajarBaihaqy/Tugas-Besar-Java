
package TugasBesar;

public class LingkunganRuangKelas extends Input {
    
    String Kebersihan(int KondisiLantai,int KondisiDinding,int KondisiAtap,int KondisiPintu,int KondisiJendela){
        if(KondisiLantai==1 && KondisiDinding==1 && KondisiAtap==1 && KondisiPintu==1 && KondisiJendela==1){
        return "Sesuai";
    }
        else{
        return "Tidak Sesuai";
    }
    }
}
