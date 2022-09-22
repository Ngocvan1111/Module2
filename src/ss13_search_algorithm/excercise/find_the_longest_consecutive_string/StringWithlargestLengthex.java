package ss13_search_algorithm.excercise.find_the_longest_consecutive_string;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringWithlargestLengthex {
    public static Scanner scanner = new Scanner(System.in);

    public static List<Character> findStringWithLargestLengthWhatIsArrange(String str) {

        List<Character> stringList1 = new ArrayList<>();
        List<Character> stringListMax = new ArrayList<>();
        stringList1.add(str.charAt(0));
        for (int i = 0; i < str.length()-1; i++) {

            if (str.charAt(i) < str.charAt(i + 1)) {
                stringList1.add(str.charAt(i + 1));
            }
            else if(stringList1.size() > stringListMax.size()){
                stringListMax.clear();
                stringListMax.addAll(stringList1);
                stringList1.clear();
                stringList1.add(str.charAt(i+1));
            }
        }
        if(stringList1.size() > stringListMax.size()){
            return stringList1;
        }
         else return stringListMax;
    }

    public static void main(String[] args) {
        System.out.print("Nhập vô 1 chuỗi");
        String str = scanner.nextLine();

        List<Character> stringListMax = StringWithlargestLengthex.findStringWithLargestLengthWhatIsArrange(str);
        for (Character element : stringListMax) {
            System.out.print(element);
        }
    }


}
