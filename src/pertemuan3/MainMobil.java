package pertemuan3;

public class MainMobil {
    public static void main(String[] args){
        Mobil mobil1= new Mobil("Toyota", "Avanza", 2012);
        
    System.out.println("Data Awal;");
    System.out.println("Merek: " + mobil1.getMerek());
    System.out.println("Model: " + mobil1.getModel());
    System.out.println("Tahun: " + mobil1.getTahun());
    
    mobil1.setMerek("Toyota");
    mobil1.setModel("Fortuner");
    mobil1.setTahun(2021);
    
    System.out.println("\nData Setelah Diubah");
    System.out.println("Merek: " + mobil1.getMerek());
    System.out.println("model: " + mobil1.getModel());
    System.out.println("Tahun: " + mobil1.getTahun());
    }
}
