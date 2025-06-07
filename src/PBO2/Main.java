
package PBO2;
public class Main {
    public static void main(String[] args ){
        Barang barang1 = new Barang("Beras","10","10000");
        Barang barang2 = new Barang("Gula","20","19000");
        
        Toko toko1 = new Toko("barokah","kayutangi","12");
        Toko toko2 = new Toko("Berkah","soedirman","25");
        
        barang1.tampilkanInfo();
        barang2.tampilkanInfo();
        toko1.tampilkanInfo();
        toko2.tampilkanInfo();
    }
    
}
