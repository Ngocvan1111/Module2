package ss6_inheritance.practive.system_of_geometric_objects;

public class Main {
    public static void main(String[] args) {
//        Shape shape1 = new Shape();
//        Shape shape2 = new Shape("green",false);
//        System.out.println(shape1);
//        System.out.println(shape2);
//        Circle circle = new Circle(10);
//        System.out.println(circle);
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        square.setSide(2.0);
        System.out.println(square);


        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
