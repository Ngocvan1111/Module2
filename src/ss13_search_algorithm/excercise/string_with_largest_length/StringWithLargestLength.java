package ss13_search_algorithm.excercise.string_with_largest_length;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringWithLargestLength {
    public static Scanner scanner = new Scanner(System.in);

    public static List<Character> findStringWithLargestLengthWhatIsArrange(String str) {
        List<Character> stringList = new ArrayList<>();
        stringList.add(str.charAt(0));
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) < str.charAt(i + 1)) {
                stringList.add(str.charAt(i + 1));
            }
        }
        return stringList;
    }

    public static void main(String[] args) {
        System.out.print("Nhập vô 1 chuỗi");
        String str = scanner.nextLine();

        List<Character> stringList = StringWithLargestLength.findStringWithLargestLengthWhatIsArrange(str);
        for (Character element : stringList) {
            System.out.print(element);
        }


    }
}
