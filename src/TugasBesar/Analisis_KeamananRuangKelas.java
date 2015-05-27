//Febri
package TugasBesar;


public class Analisis_KeamananRuangKelas extends KeamananRuangKelas {
    @Override
    String Kekokohan(){
        if(Kekokohan.equalsIgnoreCase("iya")){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return Kekokohan;
    }
    
    @Override
    String KunciPintuJendela(){
        if(KunciPintuJendela.equalsIgnoreCase("ada")){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return KunciPintuJendela;
    }
    
    @Override
    String Bahaya(){
        if(Bahaya.equalsIgnoreCase("tidak")){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return Bahaya;
    }
}
