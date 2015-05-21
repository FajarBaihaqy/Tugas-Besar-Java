package TugasBesar;

public class KondisiRuangKelas extends Input {

    int LuasRuangan(int Panjang, int Lebar) {
        return Panjang * Lebar;
    }

    String BentukRuang(int Panjang, int Lebar) {
        if (Panjang != Lebar) {
            return "Sesuai";
        } 
        else {
            return "Tidak Sesuai";
        }
    }

    String RasioLuas(int LuasRuang, int JumlahKursi) {
        int RasioLuas = LuasRuang / JumlahKursi;
        if (RasioLuas >= 0.5) {
            return "Sesuai";
        } 
        else {
            return "Tidak Sesuai";
        }

    }

    String Pintu_Jendela(int JumlahPintu, int JumlahJendela) {
        if (JumlahPintu >= 2 && JumlahJendela >= 1) {
            return "Sesuai";
        } 
        else {
            return "Tidak Sesuai";
        }

    }
}
