
package PBO2;

public class Barang {
    String nama;
    String stok;
    String harga;
    
public Barang(String nama, String stok, String harga){
    this.nama=nama;
    this.stok=stok;
    this.harga=harga;
}
public void tampilkanInfo(){
    System.out.println("barang:" + nama + ",stok:" + stok + ",harga:" + harga);
}
}
