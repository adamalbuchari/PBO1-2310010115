package pertemuan2;
public class Mobil {
   private String merek;
   private String model;
   private int tahun;
   
   public Mobil(String merek, String model, int tahun){
       this.merek = merek;
       this.model = model;
       this.tahun = tahun;
   }
   public void tampilkanInfo(){
       System.out.println("Merek: " + merek + ", Model: " + model + "Tahun:" + tahun);
   }
}
