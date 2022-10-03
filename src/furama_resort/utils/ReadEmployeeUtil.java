package furama_resort.utils;

import furama_resort.models.Customer;
import ss10_dsa_list.extra_excercise_1.model.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadEmployeeUtil {
    public static List<Customer> readCustomerDataFromFile() throws IOException {
        List<Customer> customerList = new ArrayList<>();
        File file = new File("D:\\01_codegym\\module2\\src\\furama_resort\\data\\employee.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line ;
        String[] customerArrays;
        while ((line = bufferedReader.readLine()) != null){
            customerArrays = line.split(",");
            customerList.add(new Customer(customerArrays[0],customerArrays[1],customerArrays[2],customerArrays[3],Integer.parseInt(customerArrays[4]),Integer.parseInt(customerArrays[5]),customerArrays[6],customerArrays[7],customerArrays[8]));
        }
        bufferedReader.close();
        return customerList;

    }
}
