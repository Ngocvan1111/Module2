package ss2_loop_in_java.excercise;

import java.util.Scanner;

public class PrintFirst20Prime {
    public static void main(String[] args) {
        int count=1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of prime need to print: ");
        int amount = Integer.parseInt(scanner.nextLine());
        for (int i =2; count <=amount ;i++) {
            int check = 0;
            for(int j = 1;j<=i;j++){
                if(i%j==0){
                    check ++;
                }
            }
            if(check == 2){
                System.out.println(i);
                count++;
            }

        }
    }
}
