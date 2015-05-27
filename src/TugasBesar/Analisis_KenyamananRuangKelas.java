//Febri
package TugasBesar;

public class Analisis_KenyamananRuangKelas extends KenyamananRuangKelas {
    @Override
    String Kebisingan(){
        if(Kebisingan.equalsIgnoreCase("tidak")){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return Kebisingan;
    }
    
    @Override
    String Bau(){
        if(Bau.equalsIgnoreCase("tidak")){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return Bau;
    }
    
    @Override
    String Kebocoran(){
        if(Kebocoran.equalsIgnoreCase("tidak")){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return Kebocoran;
    }
    
    @Override
    String Kerusakan(){
        if(Kerusakan.equalsIgnoreCase("tidak")){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return Kerusakan;
    }
    
    @Override
    String Keausan(){
        if(Keausan.equalsIgnoreCase("tidak")){
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        return Keausan;
    }
}
