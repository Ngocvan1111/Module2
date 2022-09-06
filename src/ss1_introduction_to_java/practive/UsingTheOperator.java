package ss1_introduction_to_java.practive;

import java.util.Scanner;

public class UsingTheOperator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println("Kết quả là : "+ area);
    }
}
