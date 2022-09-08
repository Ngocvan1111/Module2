package ss3_arrays_and_method_in_java.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinInArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of array please!\nSize =   ");
        do {
             size = Integer.parseInt(scanner.nextLine());
            if(size<0){
                System.out.print("Enter the size of array again with greater than 0 please! ");
            }
        }while (size<0);
        int[]arrays = new int[size];

        for(int i = 0; i<size;i++){
            System.out.print("Enter the element "+(i+1)+" of arrays: ");
            arrays[i] = Integer.parseInt(scanner.nextLine());
        }
        int minNumber = arrays[0];
        for (int array : arrays) {
            if (minNumber > array) {
                minNumber = array;
            }
        }
        System.out.println("Array:  "+Arrays.toString(arrays));
        System.out.print("The minNumber in arrays is: "+ minNumber);
    }
}
