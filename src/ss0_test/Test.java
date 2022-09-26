package ss0_test;

import java.util.Scanner;

public class Test {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        char a = scanner.nextLine().charAt(0);
        if(a < 67){
            System.out.println("Đúng");
        }
        else {
            System.out.println("Sai");
        }

    }
}
