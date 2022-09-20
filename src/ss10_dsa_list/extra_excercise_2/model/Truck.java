package ss10_dsa_list.extra_excercise_2.model;

public class Truck extends Vehicle  {
    private Double tonnage;

    public Truck() {
    }

    public Truck(String seaOfControl, String branch, int yearOfManufacture, String owner, Double tonnage) {
        super(seaOfControl, branch, yearOfManufacture, owner);
        this.tonnage = tonnage;
    }

    public Double getTonnage() {
        return tonnage;
    }

    public void setTonnage(Double tonnage) {
        this.tonnage = tonnage;
    }
    public String toString(){
        return super.toString()+ " || Tannage: " + getTonnage();
    }
}
