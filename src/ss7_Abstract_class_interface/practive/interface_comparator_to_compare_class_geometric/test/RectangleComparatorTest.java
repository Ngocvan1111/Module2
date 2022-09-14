package ss7_Abstract_class_interface.practive.interface_comparator_to_compare_class_geometric.test;

import ss6_inheritance.excercise.ClassCircleAndCylinder.Circle;
import ss6_inheritance.practive.system_of_geometric_objects.Rectangle;
import ss7_Abstract_class_interface.practive.interface_comparator_to_compare_class_geometric.interface_geometric.CircleComparator;
import ss7_Abstract_class_interface.practive.interface_comparator_to_compare_class_geometric.interface_geometric.RectangleComparator;

import java.util.Arrays;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(10,11);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(10,10,"yellow",false);
        System.out.println("ádd");
        for(Rectangle rectangle: rectangles){
            System.out.println(rectangle);
    }
        RectangleComparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles, rectangleComparator);
        for(Rectangle rectangle: rectangles){
            System.out.println(rectangle);
        }
}}
