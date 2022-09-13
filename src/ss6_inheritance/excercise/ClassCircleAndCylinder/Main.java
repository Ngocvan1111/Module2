package ss6_inheritance.excercise.ClassCircleAndCylinder;

public class Main {
    public static void main(String[] args) {
        // Test class circle
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(10, "Yellow");
        System.out.println(circle1);
        // Test class cylinder
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder(10.0,10.0,"Green");
        System.out.println(cylinder1);
    }
}
