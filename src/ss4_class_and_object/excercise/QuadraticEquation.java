package ss4_class_and_object.excercise;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(){
        return b*b - 4*a*c;
    }
    public double getRoot1(){
        return (-b+Math.sqrt(getDiscriminant()))/(2*a);
    }
    public double getRoot2(){
        return (-b-Math.sqrt(getDiscriminant()))/(2*a);

    }
    public String getResult(){
        if(getDiscriminant()<0){
            return "The QuadraticEquation hasn't the solution";
        }
        else if(getDiscriminant()==0){
            return "{The QuadraticEquatoon has the solition X1 = X2 = "+getRoot1()+"}";
        }
        else {
            return "{The QuadraticEquatoon has the solition X1 = "+getRoot1()+" X2 = "+getRoot2() +"}";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first value a = ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the first value b = ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the first value c = ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.print(quadraticEquation.getResult());
    }
}
