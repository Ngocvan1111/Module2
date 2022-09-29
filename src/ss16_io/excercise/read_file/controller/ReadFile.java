package ss16_io.excercise.read_file.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\01_codegym\\module2\\src\\ss16_io\\excercise\\read_file\\data\\countries.csv");
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        List<Country> countryList = new ArrayList<>();
        String line = null;
        String[] array;
        Country country;
        while ((line = bufferedReader.readLine()) != null){
            array = line.split(",");
            country = new Country(Integer.parseInt(array[0]),array[1],array[2]);
            countryList.add(country);
        }
        bufferedReader.close();
        for(Country country1:countryList){
            System.out.println(country1.getInfor());
        }




    }
}
