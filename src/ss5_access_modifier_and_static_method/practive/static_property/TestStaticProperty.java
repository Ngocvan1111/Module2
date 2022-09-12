package ss5_access_modifier_and_static_method.practive.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("mazdaz 3","thaco");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("mazdaz 4","thaco");
        System.out.println(Car.numberOfCar);
    }
}
