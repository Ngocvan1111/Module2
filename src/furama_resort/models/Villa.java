package furama_resort.models;

public class Villa extends Facility {
    private String roomStandard;
    private double swimmingPoolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String serviceCode, String serviceName, double area, double price, int maxPerson, String typeForRent, String roomStandard, double swimmingPoolArea, int numberOfFloors) {
        super(serviceCode, serviceName, area, price, maxPerson, typeForRent);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s",super.getInfo(),roomStandard,swimmingPoolArea,numberOfFloors);
    }
    public String getInfo(){
        return  String.format("%s,%s,%s,%s",super.getInfo(),roomStandard,swimmingPoolArea,numberOfFloors);
    }
}
