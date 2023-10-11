package kendaraan;

abstract class Kendaraan {
    private String merk;
    public Kendaraan(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }
    // Metode abstrak
    public abstract void suaraMesin();
}