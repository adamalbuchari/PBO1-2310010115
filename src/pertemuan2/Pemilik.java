package pertemuan2;
public class Pemilik {
    private String nama;
    private int umur;
    private Mobil mobil;
    
    public Pemilik(String nama, int umur, Mobil mobil){
        this.nama = nama;
        this.umur = umur;
        this.mobil = mobil;
    }
    
    public void tampilkanInfoPemilik(){
        System.out.println("Nama Pemilik: " + nama + ", Umur: " + umur);
        mobil.tampilkanInfo();
    }
    
}
