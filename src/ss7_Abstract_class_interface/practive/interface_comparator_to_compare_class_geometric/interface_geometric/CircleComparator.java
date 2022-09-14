package ss7_Abstract_class_interface.practive.interface_comparator_to_compare_class_geometric.interface_geometric;

import ss6_inheritance.excercise.ClassCircleAndCylinder.Circle;
import ss6_inheritance.practive.system_of_geometric_objects.Rectangle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2){
        if(c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius()< c2.getRadius()) return -1;
        else return 0;
    }
}

