package ss17_io_binary_file_amp.practive.copy_file_with_bigdata;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
   private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
       Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File sourse, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(sourse);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0){
                os.write(buffer,0,length);
            }
        } finally {
            assert is != null;
            is.close();
            assert os != null;
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File sourceFile = new File("D:\\01_codegym\\module2\\src\\ss17_io_binary_file_amp\\practive\\copy_file_with_bigdata\\data\\sourse.txt");
        File destFile = new File("D:\\01_codegym\\module2\\src\\ss17_io_binary_file_amp\\practive\\copy_file_with_bigdata\\data\\dest_file.txt");
        try{
//            copyFileUsingJava7Files(sourceFile, destFile);
            copyFileUsingStream(sourceFile,destFile);
            System.out.println("Copy completed");
        }catch (IOException ioe){
            System.out.println("can't copy that file");
            System.out.println(ioe.getMessage());
        }
    }

}
