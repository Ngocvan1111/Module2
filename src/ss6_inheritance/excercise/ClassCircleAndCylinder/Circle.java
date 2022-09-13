package ss6_inheritance.excercise.ClassCircleAndCylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";
    public Circle(){

    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }
    @Override
    public String toString(){
        return "This circle with Radius is: "+ getRadius() + " and color is: "+getColor()+" and Area is: "+getArea()+" and Perimeter is: "+ getPerimeter();
    }
}
