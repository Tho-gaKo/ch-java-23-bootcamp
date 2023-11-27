package Vererbung.KlassenUndObjekte;

public class car extends Fahrzeug {


    private int numberOfDoors;


    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    @Override
    public String toString() {

        return super.getCarBrand() +" "+ super.getCarModel() +" "+ super.getBuildYear() + " " + numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
