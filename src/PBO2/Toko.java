
package PBO2;
public class Toko{
    String nama;
    String alamat;
    String noToko;
    
public Toko(String nama, String alamat, String noToko){
    this.nama=nama;
    this.alamat=alamat;
    this.noToko=noToko;
    
}
public void tampilkanInfo(){
    System.out.println("Toko:" + nama + "alamat:" + alamat + ",no TOKO:" + noToko);
}
}
