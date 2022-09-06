package ss1_introduction_to_java.practive;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double weight;
        double height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        weight = scanner.nextDouble();
        System.out.print("Enter your height: ");
        height = scanner.nextDouble();
        double bmi = weight/(height*height);
        System.out.printf("%-20s%s","bmi","Interpretation\n");
        if(bmi >= 30){
            System.out.printf("%-20.2f và %s",bmi,"Obese");
        }
        else if(bmi >= 25){
            System.out.printf("%-20.2f%s",bmi,"Overweight");
        }
        else if(bmi >= 18.5){
            System.out.printf("%-20.2f%s",bmi,"Normal");
        }
        else {
            System.out.printf("%-20.2f%s",bmi,"Underweight");
        }

    }
}
