package ss3_arrays_and_method_in_java.practive;

import java.util.Scanner;

public class FindMaxValue {
    public static void main(String[] args) {
       double[] arrays =  createArrays();
        System.out.println("Greatest asset value: "+ arrays[findIndexOfMaxNumber(arrays)]);
        System.out.println("Index of Greatest asset : "+ findIndexOfMaxNumber(arrays));

    }
    public static double[] createArrays(){
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of array please!\nSize =   ");
        do {
            size = Integer.parseInt(scanner.nextLine());
            if(size<0|| size > 20){
                System.out.print("Enter the size of array again with greater than 0 and less than 21 please! = ");
            }
        }while (size<0|| size>20);
        double[]arrays = new double[size];

        for(int i = 0; i<size;i++){
            System.out.print("Enter the element "+(i+1)+" of arrays: ");
            arrays[i] = Double.parseDouble(scanner.nextLine());
        }
        return arrays;
    }
    public static int findIndexOfMaxNumber (double[] arr){
        int index = 0;
        double max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                index = i;
            }
        }
        return index;
    }
}
