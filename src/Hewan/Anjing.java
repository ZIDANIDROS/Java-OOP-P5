package Hewan;

class Anjing extends Hewan implements Pemakan {
    public Anjing(String nama) {
        super(nama);
    }


    public void nama() {
        System.out.println("Nama : " + getNama() + " jenisnya anjing.");
    }
    @Override
    public void bergerak() {
        System.out.println(getNama() + " berjalan dengan empat kaki.");
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " memakan daging mangsa.");
    }
}
