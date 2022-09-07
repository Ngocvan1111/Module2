package ss3_arrays_and_method_in_java.excercise;

import java.util.Scanner;

public class MaxNumberInArrays {
    public static void main(String[] args) {
        // check
//        double[][]arr = new double[][]{{1.0,2.0,3.0},{4.0,5.0,6.0},{11.0,8.0,9.0}};
//        double maxNumber = arr[0][0];
//        int indexJ = 0;
//        int indexI = 0;
//        for(int i = 0;i < arr.length;i++){
//            for(int j =0; j<arr[i].length;j++){
//                if(arr[i][j] > maxNumber){
//                    maxNumber = arr[i][j];
//                    indexI = i;
//                    indexJ = j;
//                }
//
//            }
//        }
//        System.out.println("the max number in array is: "+ maxNumber);
//        System.out.println("the index i of max number in array is: "+ indexI);
//        System.out.println("the index j of max number in array is: "+ indexJ);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size i of array: ");
        int sizeI = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter size j of array: ");
        int sizeJ = Integer.parseInt(scanner.nextLine());;
        double[][]arr = new double[sizeI][sizeJ];
        for(int i =0;i<sizeI;i++){
            for (int j = 0; j<sizeJ;j++){
                System.out.print("enter element "+(i+1)+" "+(j+1) +": ");
                arr[i][j] = scanner.nextDouble();
            }
        }
        double maxNumber = arr[0][0];
        int indexJ = 0;
        int indexI = 0;
        for(int i = 0;i < arr.length;i++){
            for(int j =0; j<arr[i].length;j++){
                if(arr[i][j] > maxNumber){
                    maxNumber = arr[i][j];
                    indexI = i;
                    indexJ = j;
                }

            }
        }
        System.out.println("the max number in array is: "+ maxNumber);
        System.out.println("the index i of max number in array is: "+ indexI);
        System.out.println("the index j of max number in array is: "+ indexJ);


    }

}
