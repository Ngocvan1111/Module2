package ss4_class_and_object.practive;

import java.util.Scanner;

public class Rectangle {
    double width, height;
    public Rectangle (){

    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String getInformation(){
        return "Rectangle {Width = "+this.width+" ||Height = "+this.height+"}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Width = ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter height = ");
        double height = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println(rectangle.getInformation());
        System.out.println("The Area of rectangle is: "+ rectangle.getArea());
        System.out.println("The perimeter of rectangle is: "+ rectangle.getPerimeter());


    }
}
