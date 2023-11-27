package Vererbung;

public class main {
    public static void main(String[] args) {
        ElectronicDevice mouse = new ElectronicDevice();
        mouse.setPriceInCent(8790);
        mouse.setName("MX Master 3S");
        mouse.setEnergyConsumptionInWatt(1);

        Screen smartTv = new Screen();
        smartTv.setPriceInCent(99900);
        smartTv.setName("OLED Smart TV");
        smartTv.setEnergyConsumptionInWatt(80);
        smartTv.setResolutionX(3840);
        smartTv.setResolutionY(2160);


        printElectronicDevice(smartTv);
    }

    public static void printElectronicDevice(ElectronicDevice a) {
        System.out.println(a);
    }
}
