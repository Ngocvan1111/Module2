package ss13_search_algorithm.excercise.implement_binary_search_algorithm_using_recursion;

import java.util.Arrays;

public class BinaryUsingRecursion {
    private static int[] array = new int[]{1, 2, 5, 4, 5, 11, 7, 8, 9};

    public static void main(String[] args) {
        BinaryUsingRecursion.arrange(array);
        System.out.println(Arrays.toString(array));
        int index = BinaryUsingRecursion.binarySearch(array, 0, array.length - 1, 9);
        System.out.println(index);
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) {
            return -1;
        }

        int midle = (right + left) / 2;
        if(value == array[midle]){
            return midle;

        }
        if (value > array[midle]) {
            left = midle+1;

        }
        if (value < array[midle]) {
            right = midle-1;
        }
        return binarySearch(array,left,right,value);




    }
    public static int[] arrange(int[] array){
        int temp;
        for(int i = 0;i <array.length;i++){
            for(int j = i; j < array.length;j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
