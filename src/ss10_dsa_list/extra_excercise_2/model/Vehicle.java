package ss10_dsa_list.extra_excercise_2.model;

public abstract class Vehicle {
    private String seaOfControl;
    private String branch;
    private int yearOfManufacture;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String seaOfControl, String branch, int yearOfManufacture, String owner) {
        this.seaOfControl = seaOfControl;
        this.branch = branch;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public String getSeaOfControl() {
        return seaOfControl;
    }

    public void setSeaOfControl(String seaOfControl) {
        this.seaOfControl = seaOfControl;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    @Override
    public String toString(){
        return "Sea of controller: "+ getSeaOfControl()+" || Branch: "+ getBranch() + " || Year of manufacture"+ getYearOfManufacture() + " || Owner" + getOwner();

    }
}
