package furama_resort.models;

public abstract class Facility {
    private String serviceName;
    private double area;
    private double price;
    private int maxPerson;
    private String typeForRent;

    public Facility() {
    }

    public Facility(String serviceName, double area, double price, int maxPerson, String typeForRent) {
        this.serviceName = serviceName;
        this.area = area;
        this.price = price;
        this.maxPerson = maxPerson;
        this.typeForRent = typeForRent;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getTypeForRent() {
        return typeForRent;
    }

    public void setTypeForRent(String typeForRent) {
        this.typeForRent = typeForRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxPerson=" + maxPerson +
                ", typeForRent='" + typeForRent + '\'' +
                '}';
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s",serviceName,area,price,maxPerson,typeForRent);
    }
}
