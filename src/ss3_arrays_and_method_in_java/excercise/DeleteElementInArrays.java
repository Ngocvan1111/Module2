package ss3_arrays_and_method_in_java.excercise;

import java.util.Scanner;

public class DeleteElementInArrays {
    public static void main(String[] args) {
        int[]oldArray = new int[]{10,4,6,7,8,6,6,6,6,6};
        int[]newArray = new int[10];
        Scanner scanner = new Scanner(System.in);
        int valueNeedToRemove = Integer.parseInt(scanner.nextLine());
        for(int i = 0, j = 0; i < oldArray.length;i++,j++){
            if(oldArray[i] != valueNeedToRemove){
                newArray[j] = oldArray[i];
            }
            else {
                j--;
            }

        }
        for(int i = 0; i<newArray.length;i++){
            System.out.println(newArray[i]);
        }
    }
}
