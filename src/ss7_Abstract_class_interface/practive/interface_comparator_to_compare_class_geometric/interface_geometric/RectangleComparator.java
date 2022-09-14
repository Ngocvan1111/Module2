package ss7_Abstract_class_interface.practive.interface_comparator_to_compare_class_geometric.interface_geometric;

import ss6_inheritance.practive.system_of_geometric_objects.Rectangle;

import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare (Rectangle r1, Rectangle r2){
      if(r1.getArea() > r2.getArea()) return 1;
      else if(r1.getArea() < r2.getArea()) return -1;
      else return 0;
    }
}
