package ss3_arrays_and_method_in_java.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class CaculateSumTheDiagonalOfASquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Tạo ma trận
        System.out.print("Enter size of Arrays: ");
        int size = Integer.parseInt(scanner.nextLine());
        double[][] arrays = new double[size][size];
        for(int i = 0; i<size;i++){
            for(int j = 0; j<size;j++){
                System.out.print("Enter element "+(i+1)+" "+(j+1)+" := ");
                arrays[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
    ////// tính toán.
        double sum = 0.0;
        for(int i=0;i<arrays.length;i++){
            for (int j = 0;j<arrays.length;j++){
                if(i==j){
                   sum += arrays[i][j];
                }
            }
        }
        for (double[] arrj:arrays){
            System.out.println(Arrays.toString(arrj));
        }
        System.out.println("Result: "+ sum);


    }
}
