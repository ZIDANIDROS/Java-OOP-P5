package kendaraan;

class Mobil extends Kendaraan {
    public Mobil(String merk) {
        super(merk);
    }

    @Override
    public void suaraMesin() {
        System.out.println("kendaraan Mobil dengan merk " + getMerk() + "memiliki suara mesin 'BBRRRR........'");
    }
}
