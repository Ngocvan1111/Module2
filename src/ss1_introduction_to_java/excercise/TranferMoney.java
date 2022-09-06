package ss1_introduction_to_java.excercise;

import java.util.Scanner;

public class TranferMoney {
    public static void main(String[] args) {
        int rate = 23000;
        int usd;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter usd: ");
        usd = scanner.nextInt();
        System.out.println("VNĐ = "+usd*rate);
    }
}
