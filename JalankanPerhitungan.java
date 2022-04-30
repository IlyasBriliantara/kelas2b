package src;

import src.model.Perhitungan;

public class JalankanPerhitungan {
    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4, 6, 0);
        s.PrintJudul();
        
        int HasilTambah = s.htngtmbh(4, 6);
        System.out.println(HasilTambah);
        
        int HasilKalian = s.htngkl(4, 6);
        System.out.println(HasilKalian);

    }
    
}
