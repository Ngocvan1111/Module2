package ss3_arrays_and_method_in_java.practive;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of array please!\nSize =   ");
        do {
            size = Integer.parseInt(scanner.nextLine());
            if(size<0|| size > 20){
                System.out.print("Enter the size of array again with greater than 0 and less than 21 please! = ");
            }
        }while (size<0|| size>20);
        int[]arrays = new int[size];

        for(int i = 0; i<size;i++){
            System.out.print("Enter the element "+(i+1)+" of arrays: ");
            arrays[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(Reserve(arrays)));

    }
    public static int[] Reserve(int[] arr){
        int temp;
        for(int i=0;i<arr.length/2;i++){
            temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
