package ss16_io.practive;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("scores.txt");
        Scanner input = new Scanner(file);
        while (input.hasNext()){
            String mild = input.next();
            String firstName = input.next();
            String lastName = input.next();
            double score = input.nextDouble();
            System.out.println(firstName+" "+mild+ " "+lastName+" "+score+" ");
        }
        input.close();

    }
}
