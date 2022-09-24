package ss14_algorithm_sort.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class IllustrationAlgorithmInsertionSort {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] input() {
        System.out.println("Nhập vào độ dài mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + " của mảng");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        return array;

    }

    public static void main(String[] args) {

        int[] array = IllustrationAlgorithmInsertionSort.input();
        System.out.println("******* Start Sort ******** ");
        for (int i = 1; i < array.length; i++) {
            System.out.println("ngắn giá trị cần sắp xếp là key = " + array[i]);
            int key = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > key; j--) {
                System.out.println("Dịch chuyển phần tử tại vị trí " + j + " tới vị trí " + (j + 1));
                array[j + 1] = array[j];
                System.out.println("Kết quả sau dời: " + Arrays.toString(array));
            }
            System.out.println("Chèn giá trị cần sắp xếp vào vị trí trống" + (j + 1) + " sau khi đã dời ra sau");
            array[j + 1] = key;
            System.out.println("Kết quả sau dời: " + Arrays.toString(array));


        }
    }


}

