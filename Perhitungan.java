package src.model;

import src.interfaces.contohInterfces;

public class Perhitungan implements contohInterfces {
    private int a;
    private int b;
    private int hasil;

    public Perhitungan(int _a , int _b , int _hasil){
        this.a = _a;
        this.b = _b;
        _hasil = 0;
        this.hasil = _hasil;
        PrintJudulClass(" Print judul dalam class perhitungan");
    }
    private void PrintJudulClass(String jdl){
    System.out.println(jdl);
}
    @Override
    public void PrintJudul() {
        // TODO Auto-generated method stub
        System.out.println("Judul Menggunakan Interface");
        
    }
    @Override
    public void HitungTambah() {
        // TODO Auto-generated method stub
        this.hasil = this.a + this.b;
        
    }
    @Override
    public void HitungKali() {
        // TODO Auto-generated method stub
        this.hasil = this.a * this.b;
        
    }
    public int htngtmbh (int a1, int a2){
        this.a = a1;
        this.b = a2;
        HitungTambah();
        return this.hasil;
    }
    public int htngkl (int a3, int a4){
        this.a = a3;
        this.b = a4;
        HitungKali();
        return this.hasil;
    }
}
