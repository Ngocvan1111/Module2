package ss3_arrays_and_method_in_java.excercise;

import java.util.Scanner;

public class AddNewElementInArrays {
    public static void main(String[] args) {
        int[]arrs = new int[]{10,4,6,7,8,0,0,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element that want to add: ");
        int element = Integer.parseInt(scanner.nextLine());
        int index;
        do {
            System.out.print("Enter the index that want to add to: ");
            index = Integer.parseInt(scanner.nextLine());
            if(index<0 || index >= arrs.length-1){
                System.out.print("Can't add in to this index \nPlease enter another index between 0 and "+(arrs.length-2));
                index = Integer.parseInt(scanner.nextLine());
            }
        }while (index<0 || index >= arrs.length-1);
        for(int j = arrs.length-1, i =arrs.length-2;i >=index;i--,j--){
            arrs[j] = arrs[i];
        }
        arrs[index] = element;
        for(int i = 0;i< arrs.length;i++){
            System.out.println(arrs[i]);
        }

    }
}
