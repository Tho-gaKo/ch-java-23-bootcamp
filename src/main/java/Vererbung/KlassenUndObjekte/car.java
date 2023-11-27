package Vererbung.KlassenUndObjekte;

public class car extends Fahrzeug  {


    private int numberOfDoors;


    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    @Override
    public String toString() {

        return " Autohersteller: " + super.getCarBrand() +", Modell: "+ super.getCarModel() +", Baujahr: "+ super.getBuildYear() + ", Anzahl Türen: " + numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
