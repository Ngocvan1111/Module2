package ss10_dsa_list.extra_excercise_2.model;

public class Car extends Vehicle {
    private int numberOfSeats;
    private String type;

    public Car() {
    }

    public Car(String seaOfControl, String branch, int yearOfManufacture, String owner, int numberOfSeats, String type) {
        super(seaOfControl, branch, yearOfManufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.type = type;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString(){
        return super.toString() + " || Number of seats: "+ getNumberOfSeats()+ " || Type: "+ getType();
    }
}
