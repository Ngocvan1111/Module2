package ss3_arrays_and_method_in_java.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumValueInColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Khai báo và tạo mảng

        System.out.print("Enter size i of array: ");
        int sizeI;
        int sizeJ;
        do {
            sizeI = Integer.parseInt(scanner.nextLine());
            if(sizeI<0){
                System.out.print("Enter the size of array again with greater than 0 please! ");
            }
        }while (sizeI<0);
        System.out.print("Enter size j of array: ");
        do {
            sizeJ = Integer.parseInt(scanner.nextLine());
            if(sizeJ<0){
                System.out.print("Enter the size of array again with greater than 0 please! ");
            }
        }while (sizeJ<0);
        double[][]arr = new double[sizeI][sizeJ];
        for(int i =0;i<sizeI;i++){
            for (int j = 0; j<sizeJ;j++){
                System.out.print("enter element "+(i+1)+" "+(j+1) +": ");
                arr[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        // kết thúc khai báo và tạo mảng
        System.out.print("enter the index of column need to sum: ");
        int indexColumn;
        do{
            indexColumn = Integer.parseInt(scanner.nextLine());
            if(indexColumn < 0|| indexColumn > arr.length-1){
                System.out.println("Enter the indexColumn of array between 0 and "+(arr.length-1));
            }
        }while (indexColumn<0);
        // Tính tổng.
        int sum =0;
        for (double[] doubles : arr) {
            for (int j = 0; j < doubles.length; j++) {
                if (j == indexColumn) {
                    sum += doubles[j];
                }
            }
        }
        System.out.println("The array we have: ");
        for (double[] arrj:arr) {
            System.out.println(Arrays.toString(arrj));

        }

        System.out.println("The Answer sum= "+sum);

    }
}
