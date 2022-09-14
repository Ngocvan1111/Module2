package ss7_Abstract_class_interface.excercise.interface_colorable_for_class_geometric;

import ss6_inheritance.practive.system_of_geometric_objects.Square;
import ss7_Abstract_class_interface.excercise.interface_colorable_for_class_geometric.colorable.Colorable;

public class SubSquare extends Square implements Colorable {
    public String howToColor(){
        return "Color all four sides";
    }
}
