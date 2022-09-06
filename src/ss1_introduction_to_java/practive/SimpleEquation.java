package ss1_introduction_to_java.practive;

import java.util.Scanner;

public class SimpleEquation {
    public static void main(String[] args) {
        float a;
        float b;
        float c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number a: = ");
        a = scanner.nextFloat();
        System.out.println("Enter the second number b: = ");
        b = scanner.nextFloat();
        System.out.println("Enter the second number c: = ");
        c = scanner.nextFloat();
        if (a != 0){
            float answer = (c-b)/a;
            System.out.printf("Equation pass width x = %f!\n", answer);
        }
        else if( b==c){
            System.out.println("The solution is all x!");
        }
        else {
            System.out.println("No solution");
        }

    }
}
