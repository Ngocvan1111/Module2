package ss6_inheritance.practive.system_of_geometric_objects;

import ss7_Abstract_class_interface.excercise.interface_colorable_for_class_geometric.colorable.Colorable;

public abstract class Shape  {
    private String color = "red";
    private boolean filled = true;
    Shape(){

    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    @Override
    public String toString(){
        return "A Shape with color of "+getColor()+ " and "+ (isFilled() ? "filled" : "not filled");
    }

}
