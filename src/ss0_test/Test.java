package ss0_test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String [] args)     {
        System.out.println(addDayBirth());

   
    }
    private static LocalDate addDayBirth() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dayOfBirth;
                System.out.print("Enter employee day of birth: ");
                dayOfBirth = LocalDate.parse(scanner.nextLine(),formatter);
        return dayOfBirth;
    }
}
