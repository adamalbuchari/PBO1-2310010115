package pertemuan4;

public class Otomotif {
    public static void main(String[] args){
    Kendaraan mobil1 = new Mobil1("Toyota Supara", 190);
    Kendaraan mobil2 = new Mobil2("Nissan Silvia S14", 180);
    
    mobil1.jalan();
    mobil2.jalan();
    
    System.out.println(mobil1.getNama() + " kecepatannya: " + mobil1.getKecepatan());
    System.out.println(mobil2.getNama() + " kecepatannya: " + mobil2.getKecepatan());
    }
}

class Kendaraan {
    private String nama;
    private int kecepatan;

    public Kendaraan(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    public String getNama() {
        return nama;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void jalan() {
        System.out.println(nama + " sedang berjalan.");
    }
}

class Mobil1 extends Kendaraan {
    public Mobil1(String nama, int kecepatan) {
        super(nama, kecepatan);
    }
    
    public void jalan() {
        System.out.println(getNama() + " melaju di jalan raya dengan kecepatan " + getKecepatan() + " km/jam.");
    }
}

class Mobil2 extends Kendaraan {
    public Mobil2(String nama, int kecepatan) {
        super(nama, kecepatan);
    }
    
    public void jalan() {
        System.out.println(getNama() + " melaju di jalan raya dengan kecepatan " + getKecepatan() + " km/jam.");
    }
}