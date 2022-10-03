package furama_resort.utils;

import furama_resort.models.Customer;
import ss10_dsa_list.extra_excercise_1.model.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteEmployeeUtil {
    public static void writeTofile(List<Customer> customers) throws IOException {
        File file = new  File("D:\\01_codegym\\module2\\src\\furama_resort\\data\\employee.csv");
        String line =null;
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Customer s:customers) {
            bufferedWriter.write(s.getInfo());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
