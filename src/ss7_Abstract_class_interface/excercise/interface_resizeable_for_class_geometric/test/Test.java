package ss7_Abstract_class_interface.excercise.interface_resizeable_for_class_geometric.test;

import ss7_Abstract_class_interface.excercise.interface_resizeable_for_class_geometric.Shape.Circle;
import ss7_Abstract_class_interface.excercise.interface_resizeable_for_class_geometric.Shape.Rectangle;
import ss7_Abstract_class_interface.excercise.interface_resizeable_for_class_geometric.Shape.Shape;
import ss7_Abstract_class_interface.excercise.interface_resizeable_for_class_geometric.Shape.Square;
import ss7_Abstract_class_interface.excercise.interface_resizeable_for_class_geometric.resizeable_interface.Resizeable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10,10);
        shapes[2] = new Square(10);
        System.out.println("Befor resize");
        for(Shape shape:shapes){
            System.out.println(shape);
        }
        System.out.println("After resize");
        int x = (int) (Math.random() * 100);
        for(Shape shape:shapes){
           shape.resize(x);
            System.out.println(shape);
        }
    }
}
