package pertemuan2;
public class Main {
    public static void main(String[] args){
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020);
        Mobil mobil2 = new Mobil("Honda", "Civic", 2022);
        
        Pemilik pemilik1 = new Pemilik("Andi", 30, mobil1);
        Pemilik pemilik2 = new Pemilik("Budi", 24, mobil2);
        
        pemilik1.tampilkanInfoPemilik();
        pemilik2.tampilkanInfoPemilik();
    }
    
}
