package kendaraan;

public class Main {
    public static void main(String[] args) {
        Mobil mobilLamborghini = new Mobil("AVENTADOR");
        mobilLamborghini.suaraMesin();
        SepedaMotor motorHonda = new SepedaMotor("SupraX");
        motorHonda.suaraMesin();
    }
}