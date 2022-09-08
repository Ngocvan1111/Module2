package ss0_test;

import java.util.Arrays;
import java.util.Scanner;

public class createArrrays2axisWithDifferentLengthofAxis2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size i of array: ");
        int sizeI = Integer.parseInt(scanner.nextLine());
        double[][] arr = new double[sizeI][];
        for (int i = 0; i < sizeI; i++) {
            System.out.println("Enter length of arr " + i + "in arr");
            int sizeJ = Integer.parseInt(scanner.nextLine());
            arr[i] = new double[sizeJ];
            for (int j = 0; j < sizeJ; j++) {
                System.out.print("enter element " + (j + 1) + ": ");
                arr[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        System.out.println("Array: ");
        for (double[] arrJJ:arr) {
            System.out.print(Arrays.toString(arrJJ));

        }

    }
}
