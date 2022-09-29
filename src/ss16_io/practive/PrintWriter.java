package ss16_io.practive;

import java.io.FileNotFoundException;

public class PrintWriter {
    public static void main(String[] args) throws FileNotFoundException {
        java.io.File file = new java.io.File("scores.txt");
        if(file.exists()){
            System.out.println("This file already exists");
            System.exit(1);
        }
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        output.println("Lại");
        output.println("Văn");
        output.println("Ngọc");
        output.println(90);
        output.close();
        System.out.println();
    }
}
