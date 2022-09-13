package ss6_inheritance.excercise.ClassCircleAndCylinder;

public class Cylinder extends Circle {
    private double height = 1.0;
    public Cylinder(){
    }
    public Cylinder(double height, double radius, String color){
        super(radius,color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getRadius()*getRadius()*Math.PI*this.height;
    }
    @Override
    public String toString(){
        return "This Cylinder with Radius is: "+ getRadius() + "and heigt is: "+getHeight()+ " and color is: "+getColor()+" and Area is: "+getArea()+" and Perimeter is: "+ getPerimeter()+" and Volume is: "+ getVolume();
    }
}
