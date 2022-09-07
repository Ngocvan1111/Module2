package ss3_arrays_and_method_in_java.excercise;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]arr1 = new int[5];
        for(int i =0;i<5;i++){
            System.out.print("Enter the element in arr1: ");
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        int[]arr2 = new int[5];
        for(int i =0;i<5;i++){
            System.out.print("Enter the element in arr2 : ");
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }
        int[]arr3 = new int[10];
        for(int i=0,j=0,k=0;i < arr1.length+arr2.length;i++){
            if(i<arr1.length){
                arr3[i] = arr1[j];
                j++;
            }
            else {
                arr3[i] = arr2[k];
                k++;
            }

        }
        System.out.println("Element in arr3 is: ");
        for(int i =0; i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
