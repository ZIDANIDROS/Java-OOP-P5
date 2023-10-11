package kendaraan;

class SepedaMotor extends Kendaraan {
    public SepedaMotor(String merk) {
        super(merk);
    }

    @Override
    public void suaraMesin() {
        System.out.println("Sepeda motor dengan merk " + getMerk() + "memiliki suara mesin 'Hrr Hrrr'");
    }
}