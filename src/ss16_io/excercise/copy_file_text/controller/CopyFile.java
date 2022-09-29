package ss16_io.excercise.copy_file_text.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        List<Character> numberChar = new  ArrayList<>();
        try{
            File inFile = new File("D:\\01_codegym\\module2\\src\\ss16_io\\excercise\\copy_file_text\\data\\file1.txt");
            FileReader fileReader = new FileReader(inFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            FileWriter writer = new FileWriter("D:\\01_codegym\\module2\\src\\ss16_io\\excercise\\copy_file_text\\data\\file2.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            while ((line = reader.readLine()) != null){
                bufferedWriter.write(line +"\n");
                for(int i =0;i<line.length();i++){
                    if(line.charAt(i) != ' '){
                        numberChar.add(line.charAt(i));
                    }

                }
            }
            System.out.print("các ký tự là: ");
            for(Character character:numberChar){
                System.out.print(character);
            }
            System.out.println("\nTổng số ký tự là: "+numberChar.size());
            reader.close();
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("File khong ton tai or noi dung loi");
        }

    }
}
