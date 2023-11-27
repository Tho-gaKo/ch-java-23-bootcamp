package Vererbung.KlassenUndObjekte;

public class Fahrzeug {

    public static void main(String[] args) {
        car porsche = new car();
        porsche.setBuildYear(2016);
        porsche.setCarBrand("prosche");
        porsche.setCarModel("GT3 RS");
        porsche.setNumberOfDoors(2);

        car porsche2 = new car();
        porsche2.setBuildYear(1942);
        porsche2.setCarModel("Maus");
        porsche2.setNumberOfDoors(0);
        porsche2.setCarBrand("Porsche");


    }

}
