package ss10_dsa_list.extra_excercise_2.model;

public class Motobike extends Vehicle {
    private Double power;

    public Motobike() {
    }

    public Motobike(String seaOfControl, String branch, int yearOfManufacture, String owner, Double power) {
        super(seaOfControl, branch, yearOfManufacture, owner);
        this.power = power;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }
    @Override
    public String toString(){
        return super.toString()+ " || Power: "+ getPower();
    }
}
