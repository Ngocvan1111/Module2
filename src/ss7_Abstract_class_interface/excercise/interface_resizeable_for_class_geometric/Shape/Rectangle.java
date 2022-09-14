package ss7_Abstract_class_interface.excercise.interface_resizeable_for_class_geometric.Shape;

import ss7_Abstract_class_interface.excercise.interface_resizeable_for_class_geometric.resizeable_interface.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double height = 1.0;
    public Rectangle(){

    }
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double setPerimeter(){
        return (width+height)*2;
    }
    @Override
    public String toString(){
        return "A Rectangle with width = "+getWidth()+" and length = "+getHeight()+". which is a subclass of "+super.toString();
    }
    @Override
    public void resize(double percent){
        setWidth(getWidth()*percent/100+getWidth());
        setHeight(getHeight()*percent/100+getHeight());
    }
}
