package Hewan;

abstract class Hewan {
    private String nama;
    public Hewan(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    public abstract void bergerak();
}

