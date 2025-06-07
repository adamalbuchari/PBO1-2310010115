package pertemuan3;

public class Mobil {
    private String merek;
    private String model;
    private int tahun;
    
    public Mobil(String merek, String model, int tahun){
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
    }
    
    public void setMerek(String merekBaru){
        this.merek = merekBaru;
    }
    
    public void setModel(String modelBaru){
        this.model = modelBaru;
    }
    
    public void setTahun(int tahunBaru){
        this.tahun = tahunBaru;
    }
    
    public String getMerek(){
        return this.merek;
    }
    
    public String getModel(){
        return this.model;
    }
    
    public int getTahun(){
        return this.tahun;
    }
}
