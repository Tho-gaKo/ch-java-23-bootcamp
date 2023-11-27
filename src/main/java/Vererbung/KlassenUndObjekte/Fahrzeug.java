package Vererbung.KlassenUndObjekte;

public class Fahrzeug {

    private String carBrand;
    private String carModel;
    private int buildYear;

    public static void main(String[] args) {
        car porsche = new car();
        porsche.setBuildYear(2016);
        porsche.setCarBrand("prosche");
        porsche.setCarModel("GT3 RS");
        porsche.setNumberOfDoors(2);

        car porsche2 = new car();
        porsche.setBuildYear(2016);
        porsche.setCarBrand("prosche");
        porsche.setCarModel("GT3 RS");
        porsche.setNumberOfDoors(2);

        car porsche3 = new car();
        porsche.setBuildYear(2016);
        porsche.setCarBrand("prosche");
        porsche.setCarModel("GT3 RS");
        porsche.setNumberOfDoors(2);

        car porsche4 = new car();
        porsche.setBuildYear(2016);
        porsche.setCarBrand("prosche");
        porsche.setCarModel("GT3 RS");
        porsche.setNumberOfDoors(2);

        car porsche5 = new car();
        porsche2.setBuildYear(1942);
        porsche2.setCarModel("PzKw VIII Maus");
        porsche2.setNumberOfDoors(0);
        porsche2.setCarBrand("Porsche");

        printFahrzeug(porsche);
        printFahrzeug(porsche2);


    }

    @Override
    public String toString() {

        return carBrand +" "+ carModel +" "+ buildYear;
    }

    public static void printFahrzeug (car a){
        System.out.println(a);

    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }
}
