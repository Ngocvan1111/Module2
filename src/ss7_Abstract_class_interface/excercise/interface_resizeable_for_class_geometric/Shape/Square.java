package ss7_Abstract_class_interface.excercise.interface_resizeable_for_class_geometric.Shape;

import ss7_Abstract_class_interface.excercise.interface_resizeable_for_class_geometric.resizeable_interface.Resizeable;

public class Square extends Rectangle implements Resizeable {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    public double getSide() {
        return getWidth();
    }

//    @Override
//    public void setWidth(double width) {
//        setSide(width);
//    }
//    @Override
//    public void setHeight(double height) {
//        setSide(height);
//    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()+" and Area= "
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }
    public void resize(double percent){
        setWidth(getWidth()*percent/100+getWidth());
        setHeight(getHeight()*percent/100+getHeight());
    }


}
