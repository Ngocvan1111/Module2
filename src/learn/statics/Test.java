package learn.statics;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0] = new Rectangle();
        shapes[1] = new Square();
        shapes[2] = new Circle();
        shapes[4] = new Rectangle();
        shapes[5] = new Square();
        shapes[6] = new Circle();
        shapes[3] = new Rectangle();
        shapes[7] = new Square();
        shapes[8] = new Circle();
        shapes[9] = new Rectangle();
//        shapes[10] = new Square();
        shapes[11] = new Circle();
        System.out.println(Shape.count);

    }
}
