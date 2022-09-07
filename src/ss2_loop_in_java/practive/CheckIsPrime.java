package ss2_loop_in_java.practive;

import java.util.Scanner;

public class CheckIsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check is Prime: ");
        int number = Integer.parseInt(scanner.nextLine());
        int check =0;
        for(int i = 1;i<=number;i++){
            if(number%i == 0){
                check++;
            }
        }
        if(check == 2){
            System.out.println("This is a Prime number");
        }
        else {
            System.out.println("This not a Prime number");

        }
    }
}
