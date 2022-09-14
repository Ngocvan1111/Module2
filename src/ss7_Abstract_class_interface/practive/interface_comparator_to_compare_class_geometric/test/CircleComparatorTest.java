package ss7_Abstract_class_interface.practive.interface_comparator_to_compare_class_geometric.test;

import ss6_inheritance.excercise.ClassCircleAndCylinder.Circle;
import ss7_Abstract_class_interface.practive.interface_comparator_to_compare_class_geometric.interface_geometric.CircleComparator;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.4,"Green",true);
        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        for(Circle circle: circles){
            System.out.println(circle);
        }
    }
}
