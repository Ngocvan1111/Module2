package ss14_algorithm_sort.excercise;

import java.util.Arrays;

public class InstallAlgorithmInsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1,4,5,7,5};
        int[] result =  InstallAlgorithmInsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] insertionSort(int[] array){
        for (int i = 1; i<array.length;i++){
            int key =array[i];
            int j;
            for( j = i -1;j>=0&& array[j]>key;j--){
                array[j+1] = array[j];
            }
            array[j+1] = key;
        }
        return array;
    }
}
