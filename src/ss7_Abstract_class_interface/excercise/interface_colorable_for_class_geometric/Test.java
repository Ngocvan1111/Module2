package ss7_Abstract_class_interface.excercise.interface_colorable_for_class_geometric;

import ss6_inheritance.practive.system_of_geometric_objects.Circle;
import ss6_inheritance.practive.system_of_geometric_objects.Rectangle;
import ss6_inheritance.practive.system_of_geometric_objects.Shape;
import ss7_Abstract_class_interface.excercise.interface_colorable_for_class_geometric.colorable.Colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new SubSquare();
        for(Shape shape:shapes){
            System.out.println(shape+ "\n");
            if(shape instanceof SubSquare){
                Colorable colorable = (SubSquare)shape;
                System.out.println(colorable.howToColor());
            }

        }
    }
}