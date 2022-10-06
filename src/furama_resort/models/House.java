package furama_resort.models;

public class House extends Facility{
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String serviceCode, String serviceName, double area, double price, int maxPerson, String typeForRent, String roomStandard, int numberOfFloors) {
        super(serviceCode, serviceName, area, price, maxPerson, typeForRent);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s",super.getInfo(),roomStandard,numberOfFloors);
    }
    public String getInfo(){
        return String.format("%s,%s,%s",super.getInfo(),roomStandard,numberOfFloors);
    }

}
